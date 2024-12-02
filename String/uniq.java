// ? NOn repeating charater
// !  Day-17
class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        int n=s.length();
        char ans='$';
        for(int i=0 ; i<n;i++){
            boolean isUniq = true;
            
            for(int j=0;j<n;j++){
                if(i!= j && s.charAt(i) == s.charAt(j)){
                    isUniq=false;
                    break; // duplicate occured no need to check current val
                }
            }
            if(isUniq){
                ans=s.charAt(i);
                break; // first uniq , so no need to run more
            }
        }
        return ans;
    }
}
