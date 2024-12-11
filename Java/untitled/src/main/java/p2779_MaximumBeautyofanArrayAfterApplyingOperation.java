import java.util.Arrays;

public class p2779_MaximumBeautyofanArrayAfterApplyingOperation {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int n = nums.length;
        int max = 1;
        // Use a sliding window
        for (int right = 0; right < n; right++) {
            while (nums[right] - nums[left] > 2 * k) {
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String args[]){
        p2779_MaximumBeautyofanArrayAfterApplyingOperation solution = new p2779_MaximumBeautyofanArrayAfterApplyingOperation();
        int nums1[] = {4,6,1,2};
        System.out.println(solution.maximumBeauty(nums1,2));
        int nums2[] = {1,1,1,1,1};
        System.out.println(solution.maximumBeauty(nums2,10));


    }}
