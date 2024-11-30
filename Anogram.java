// anogram 


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

         if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++; // Increment count  s1
            freq[s2.charAt(i)]--; // Decrement count  s2
        }
        // check if all counts are zero
        for (int count : freq) {
            if (count != 0) {
                return false; 
            }
        }
        return true;
    }
}