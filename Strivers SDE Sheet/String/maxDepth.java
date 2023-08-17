class Solution {
    public int maxDepth(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            if(c[i] == '('){
                count++;
                ans = Math.max(count, ans);
            }
            if(c[i] == ')'){
                count--;
                ans = Math.max(count , ans);
            }
        }
        return ans;
    }
}