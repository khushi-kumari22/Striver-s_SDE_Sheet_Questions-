// Q:  Union of Two Sorted Arrays

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {

        ArrayList<Integer>ans=new ArrayList<>();
        int i=0;
        int j=0;
        int prev=-1;

        while(i<n&&j<m){

            if(arr1[i]<arr2[j]){

                if(arr1[i]!=prev){
                    ans.add(arr1[i]);
                }
                prev=arr1[i];
                i++;
            }

            else if(arr1[i]>arr2[j]){

                if(arr2[j]!=prev){
                    ans.add(arr2[j]);
                }
                prev=arr2[j];
                j++;
            }

            else if(arr1[i]==arr2[j]){

                if(arr1[i]!=prev){
                    ans.add(arr1[i]);
                    prev=arr1[i];
                }
                i++;
                j++;
            }
        }

        while(i<n){
            if(arr1[i]!=prev){
                ans.add(arr1[i]);
                prev=arr1[i];
            }
            i++;
        }

        while(j<m){
            if(arr2[j]!=prev){
                ans.add(arr2[j]);
                prev=arr2[j];
            }
            j++;
        }
        return ans;
    }
}