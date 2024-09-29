class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int ele : nums){
            if(mp.containsKey(ele)){
                mp.put(ele, mp.get(ele)+1);
            }
            else{
                mp.put(ele, 1);
            }
        }

        for(int ele : nums){
            if(mp.get(ele) == 1){
                return ele;
            }
        }
        
        return -1;
    }
}