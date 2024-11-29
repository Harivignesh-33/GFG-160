//?  Implement Atoi  1

class Solution {
    public int myAtoi(String s) {
        // Your code here
         int sign = 1, result = 0, index = 0, INT_MAX = 2147483647, INT_MIN = -2147483648;

        while (index < s.length() && s.charAt(index) == ' ') {
            index++; 
        }
        
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-'))
            sign = (s.charAt(index++) == '-') ? -1 : 1; 

        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
         
            int digit = s.charAt(index++) - '0'; 
         
            if (result > (INT_MAX - digit) / 10) return (sign == 1) ? INT_MAX : INT_MIN; // Check overflow
         
            result = result * 10 + digit; 
        }
        return result * sign; 
    }
}