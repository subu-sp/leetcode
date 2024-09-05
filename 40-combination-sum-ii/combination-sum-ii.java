class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //Each number in candidates may only be used once in the combination.
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        gen(0, candidates, target, ans, new ArrayList<>());
        return ans;

    }

    private void gen(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> curr){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = ind ; i < arr.length; i++){
            if(i>ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            curr.add(arr[i]);
            gen(i+1, arr, target-arr[i], ans, curr);
            curr.remove(curr.size()-1);
            

        }
    }
}