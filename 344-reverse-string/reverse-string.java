class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int start = 0, end = n - 1; start < end; start++, end--){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }


    }
}