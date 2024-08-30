class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] word = s.split("\\s+");
        String last = word[word.length -1];

        return last.length();

    }
}