//not optimised space complexity
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        rp(nums, freq, ds, ans);
        return ans;
    }
    private void rp(int[] arr, boolean[] freq, List<Integer> ds, List<List<Integer>> ans){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i<arr.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                rp(arr, freq, ds, ans);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
}