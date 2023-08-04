// Q: Median of two sorted arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        int med1 = 0;
        int med2 = 0;

        for(int i=0; i<=(n1 + n2)/2; i++){
            med1 = med2;

            if(index1 == n1){
                med2 = nums2[index2];
                index2++;
            }
            else if(index2 == n2){
                med2 = nums1[index1];
                index1++;
            }
            else if(nums1[index1] < nums2[index2]){
                med2 = nums1[index1];
                index1++;
            }
            else{
                med2 = nums2[index2];
                index2++;
            }
        }

        if((n1 + n2) % 2 == 0){
            return (float)(med1+med2)/2;
        }

        return med2;
    }
}