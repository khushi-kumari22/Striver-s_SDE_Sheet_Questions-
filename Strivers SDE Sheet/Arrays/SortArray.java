// Q:  Sort an array of 0s, 1s and 2s

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