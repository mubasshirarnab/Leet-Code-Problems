package HardProblems;


/*      Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
                The overall run time complexity should be O(log (m+n)).

                Input: nums1 = [1,2], nums2 = [3,4]
                Output: 2.50000
                Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.  */

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] sortedMergedArray = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                sortedMergedArray[k] = nums1[i];
                i++;
            }
            else {
                sortedMergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length){
            sortedMergedArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length){
            sortedMergedArray[k] = nums2[j];
            j++;
            k++;
        }

        if (sortedMergedArray.length % 2 == 1){
            return sortedMergedArray[sortedMergedArray.length / 2];
        }
        else{
            return ((double) sortedMergedArray[sortedMergedArray.length / 2]
                    + (double)sortedMergedArray[(sortedMergedArray.length / 2)-1]) / 2;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Solution S = new Solution();
        System.out.println(S.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
