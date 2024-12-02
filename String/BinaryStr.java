// ? Add binary stringss
// !  Day-15
class Solution {
    public String addBinary(String s1, String s2) {
        // code here
         StringBuilder ans = new StringBuilder();
        int carry = 0;

        int i = s1.length() - 1;
        int j = s2.length() - 1;

        
        while (i >= 0 || j >= 0 || carry > 0) {
            int val = carry;
            if (i >= 0) val += s1.charAt(i--) - '0';
            if (j >= 0) val += s2.charAt(j--) - '0';

            carry = val / 2;
            ans.append(val % 2); // adding the current digit
        }

        // Reverse 
        ans.reverse();

        // remove the leading zeros
        int startIndex = 0;
        while (startIndex < ans.length() && ans.charAt(startIndex) == '0') {
            startIndex++;
        }

        // If all zeros, return "0"
        if (startIndex == ans.length()) {
            return "0";
        }

        return ans.substring(startIndex);
    }
}

