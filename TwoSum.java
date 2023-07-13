package EasyProblems;

public class TwoSum {
    public void twoSum(int[] nums, int target) {
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
        for (int k = 0; k < outputArray.length; k++){
            System.out.println(outputArray[k]+1);
        }
    }
}

class Check {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(new int[]{1,2,3,4,5},7);
    }
}
