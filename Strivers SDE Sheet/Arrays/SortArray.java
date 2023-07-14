// Q:  Sort an array of 0s, 1s and 2s

// Approach 1:

class Solution
{
    public static void SortArray(int a[], int n)
    {
        int zero=0;
        int one=0;
        int two =0;

        for(int i=0;i<n;i++){
            if(a[i] == 0){
                zero+=1;
            }
            else if(a[i]==1){
                one+=1;
            }

            else if(a[i]==2){
                two+=1;
            }
        }

        for(int i=0;i<n;i++){
            if(i<zero){
                a[i] = 0;
            }
            if(i>=zero && i<zero+one){
                a[i] = 1;
            }
            if(i>=zero+one && i<n){
                a[i] = 2;
            }
        }
    }
}

//  Approach 2:
    
    public static void SortArray(int a[], int n){
             int i = 0;
             int start = 0;
             int end = n-1;

             while(i<=end){
                 if(a[i]==0){
                 swap(a,i,start);
                 start++;
                 i++;
               }
                 else if(a[i]==1){
                  i++;
                 }
                 else{
                 swap(a,i,end);
                 end--;
               }
             }
           }

        static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        }
