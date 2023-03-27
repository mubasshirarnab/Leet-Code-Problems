package EasyProblems;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] outputArray = new int[2];

        for (i = 0; i < nums.length; i++){
            for (j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    outputArray[0] = i;
                    outputArray[1] = j;
                }
            }
        }
        return outputArray;
    }
}

