public class p1760_MinimumLimitofBallsinaBag {

    public int minimumSize(int[] nums, int maxOperations) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int low = 1;
        int high = max;
        while (low < high) {
            int mid = (low + high) / 2;
            if (canAchieve(nums, maxOperations, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canAchieve(int[] nums, int maxOps, int p) {
        long neededOps = 0;
        for (int x : nums) {
            if (x > p) {
                neededOps += (x - 1) / p;
                if (neededOps > maxOps) {
                    return false;
                }
            }
        }
        return neededOps <= maxOps;
    }

    public static void main(String[] args) {
        p1760_MinimumLimitofBallsinaBag sol = new p1760_MinimumLimitofBallsinaBag();

        int[] nums1 = {9};
        int maxOperations1 = 2;
        System.out.println(sol.minimumSize(nums1, maxOperations1));

        int[] nums2 = {2,4,8,2};
        int maxOperations2 = 4;
        System.out.println(sol.minimumSize(nums2, maxOperations2));
    }
}
