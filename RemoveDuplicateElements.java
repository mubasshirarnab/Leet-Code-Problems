package EasyProblems;

public class RemoveDuplicateElements {
    public int removeDuplicates(int[] nums) {
        int i, j, l, k = nums.length, n = nums.length;

        for (i = 0; i  < n; i++){
            for (j = i+1; j < n; j++){
                if (nums[i] == nums[j]){
                    for(l = j; l < n-1; l++){
                        nums[l]=nums[l+1];
                    }
                    n--;
                    j--;
                    k--;
                    continue;
                }
                else {
                    break;
                }
            }
        }
        return k;
    }
}
