class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (start < end) {
            while (start < end && !vowels.contains(chars[start] + "")) { //Using + "" is a concise way to convert a char or other primitive types to a String, like 'a' is converted to the string "a".
                start++;
            }
            
            while (start < end && !vowels.contains(chars[end] + "")) {
                end--;
            }
            
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            start++;
            end--;
        }
        return String.valueOf(chars);
    
    }
}