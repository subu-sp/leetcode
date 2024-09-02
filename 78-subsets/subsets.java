class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generate(int i, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we have considered all elements
        if (i >= nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(nums[i]);
        generate(i + 1, nums, current, result);

        // Exclude the current element (backtracking)
        current.remove(current.size() - 1);
        generate(i + 1, nums, current, result);
    }

}