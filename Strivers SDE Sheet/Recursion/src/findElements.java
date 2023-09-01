import java.util.ArrayList;

public class findElements {
    public static void main(String[] args) {
        int[] arr = {2, 32, 12, 12, 3, 4};
        System.out.println(find(arr, 12, 0));
        System.out.println(findIndex(arr, 12, 0));
        System.out.println(LastIndex(arr, 12, arr.length-1));

        FindAllIndex(arr, 12, 0);
        System.out.println(list);

        System.out.println(findAllIndex(arr, 12, 0, new ArrayList<>()));
        //or
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 12, 0, list);
        System.out.println(ans);

        System.out.println(FindAllIndex2(arr, 12, 0));
    }
    // Return boolean value:
    public static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target || find(arr, target, index+1) );
    }

    // Return index value:
    public static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }

    // Search from the last Index:
    public static int LastIndex(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return LastIndex(arr, target, index-1);
        }
    }

    // Search all the indexes
    static ArrayList<Integer> list = new ArrayList<>();
    public static void FindAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
           FindAllIndex(arr, target, index+1);
    }

    // Search all index using arrayList
     public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer>list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    // Optional approach: Return all the index using new ArrayList at every index
    public static ArrayList<Integer> FindAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> AllAnswer = FindAllIndex2(arr, target, index+1);
        list.addAll(AllAnswer);   // addAll function is used to add all the ArrayList value
        return list;
    }
}
