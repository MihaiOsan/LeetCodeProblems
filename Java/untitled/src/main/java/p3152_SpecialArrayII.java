import java.util.Arrays;

public class p3152_SpecialArrayII {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int numlen = nums.length, qlen = queries.length;
        boolean[] solution = new boolean[qlen];
        int[] sir = new int[numlen];
        Arrays.fill(sir, -1);
        sir[0] = 0;
        for (int i=1;i<numlen;i++){
            if (nums[i]%2!=nums[i-1]%2) {
                if (sir[i-1]!=-1){
                    sir[i]=sir[i-1];
                }
                else {
                    sir[i]=i-1;
                    sir[i-1]=i-1;
                }
            }
        }
        for (int i=0;i<numlen;i++){
            System.out.print(sir[i]+ " ");
        }
        System.out.println();
        for (int i=0;i<qlen;i++){
            if (sir[queries[i][0]]==sir[queries[i][1]]&& sir[queries[i][1]]!=-1 )
                solution[i]=true;
            else if (queries[i][0]==queries[i][1])
                solution[i]=true;
            else
                solution[i]=false;
        }

        return solution;
    }

    public static void main(String[] args){
        p3152_SpecialArrayII solution = new p3152_SpecialArrayII();

        int[] nums = {7,7};
        int[][] queries = {{1,1}};
        boolean[] sol = solution.isArraySpecial(nums,queries);

        for (int i =0 ;i<sol.length;i++){
            System.out.print(sol[i]+" ");
        }
        System.out.println();

        int[] nums2 = {9,10,6,2};
        int[][] queries2 = {{2,3}};
        boolean[] sol2 = solution.isArraySpecial(nums2,queries2);

        for (int i =0 ;i<sol2.length;i++){
            System.out.print(sol2[i]+" ");
        }
    }
}
