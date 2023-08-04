// Q:  KOKO EATING BANANAS

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = 1000000000;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int hours = 0;
            for(int i=0; i<piles.length; i++){
                hours += Math.ceil(1.0 * piles[i] / mid);
            }
            if(hours > h){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}