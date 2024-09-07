class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        f(0, nums, new ArrayList<>(), ans);
        return ans;
    }
    private void f(int index, int[] arr, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i= index; i<arr.length; i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            f(i+1, arr, ds, ans);
            ds.remove(ds.size()-1);
        }
    }
/*

Use private for the helper method f when it's intended to be used only within the class Solution itself. This is a good practice for encapsulation because it prevents other classes from accessing or modifying the method, keeping the implementation details hidden.

Use public for the helper method f only if you need to allow other classes or parts of your code to access and use this method directly. In the context of the subsetsWithDup problem, it's uncommon to expose the helper method outside the class since it is generally only relevant to the internal logic of the class.

*/

}