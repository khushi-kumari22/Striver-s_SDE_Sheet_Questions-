// Given two strings s and t, determine if they are isomorphic.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] ans = new int[256];
        // There are total 128 characters in ASCII value so for  we are two Strings
        //  we take 256 Characters.

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<=s.length()-1; i++){
            if(ans[s.charAt(i)] != ans[t.charAt(i)+128]){
                return false;
            }
            else{
                ans[s.charAt(i)] = ans[t.charAt(i)+128] = i+1;
            }
        }
        return true;
    }
}