import java.util.Arrays;

public class p2779_MaximumBeautyofanArrayAfterApplyingOperation {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int n = nums.length;
        int max = 1;
  