// Find all duplicates in an array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }

        for(i = 0; i< nums.length; i++){
            if(nums[i] != i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
/*  Arrays.sort(nums);
    for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) {
                list.add(nums[i]);
            }
        }
        return list;
    }
*/



