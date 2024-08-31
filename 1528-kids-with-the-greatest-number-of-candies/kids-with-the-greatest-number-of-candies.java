class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> results = new ArrayList<>();
        int max = 0;
        for(int i:candies){
            if(i>max)
            max = i ;
            
        } 
        for(int i:candies){
            results.add(extraCandies + i >= max);
        }
        return results;
    }
}