import java.util.Arrays;

public class p2779_MaximumBeautyofanArrayAfterApplyingOperation {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int i,j;
        int n = nums.length;
        int max = 1;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(nums[j] - nums[i] <=2*k)
                    if (j-i+1>max)
                        max=j-i+1;
            }
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
