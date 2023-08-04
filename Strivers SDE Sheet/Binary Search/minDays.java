//  Q:  Minimum no of days to make a bouquet

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        int start = 0;
        int end = 2000000000;
        int days = 1;

        if (m * k > n) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int CountR= 0;
            int CountB = 0;

            for (int i = 0; i < n; i++) {

                if (bloomDay[i] <= mid) {
                    CountR++;
                }
                else {
                    CountR = 0;
                }

                if (CountR == k) {
                    CountB++;
                    CountR = 0;
                }
            }

            if (CountB >= m) {
                days = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return days;
    }
}
