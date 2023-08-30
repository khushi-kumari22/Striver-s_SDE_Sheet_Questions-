public class SearchTarget {
    public static void main(String[] args) {
       int[] arr = {12, 14, 23, 28, 10, 5};
       System.out.println(SearchTarget(arr, 10, 0,arr.length-1));
    }
    public static int SearchTarget(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return SearchTarget(arr, target, start, mid-1);
            }
            else{
                return SearchTarget(arr, target, mid+1, end);
            }
        }
        if(target >= arr[mid] && arr[mid]< arr[end]){
            return SearchTarget(arr, target, start, mid-1);
        }
        return SearchTarget(arr, target, mid+1, end);
    }

}
