//  Q: Find all pairs with a given sum

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here
        Arrays.sort(A);
        Arrays.sort(B);

        ArrayList<pair> ans =new ArrayList<pair>();

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){

                if(A[i]+B[j]==X){
                    ans.add(new pair(A[i],B[j]));

                }
            }
        }

        pair[] order = new pair[ans.size()];
        return ans.toArray(order);
    }

}