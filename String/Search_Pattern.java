// ?Search-pattern  KMP Algorithm  
// !  Day-18

import java.util.ArrayList;

class Solution {
    // User function Template for Java
    static void computeLPS(String pat, int m, int[] lps) {
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;   // Start from the second character

        lps[0] = 0; // LPS for the first character , always 0

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    ArrayList<Integer> search(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();
        int[] lps = new int[m]; // Use an array for LPS
        ArrayList<Integer> result = new ArrayList<>();

        computeLPS(pat, m, lps);

        int i = 0; // Index for txt
        int j = 0; // Index for pat

        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                // Match found; add the starting index (1-based index)
                result.add(i - j );
                j = lps[j - 1];
            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return result;
    }
}