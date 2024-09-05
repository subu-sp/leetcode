
//same number may be chosen from candidates an unlimited number of times.
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        gen(0, candidates, target, new ArrayList<>(), res);
        return res;
    }
    private void gen(int i, int[] arr,int target, List<Integer> curr, List<List<Integer>> res){
            
          if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        if (target < 0 || i == arr.length) {
            return;
        }
            curr.add(arr[i]);
            gen(i, arr, target - arr[i], curr, res);

            curr.remove(curr.size()-1);
            gen(i+1, arr, target, curr, res);

        }
    

    
}