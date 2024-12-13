import java.util.*;

public class p2593_FindScoreofanArrayAfterMarkingAllElements {

//    public long findScore(int[] nums) {
//        int n = nums.length;
//
//        Map<Integer, List<Integer>> sortedMap = new TreeMap<>();
//
//        for (int i = 0; i < n; i++) {
//            int value = nums[i];
//            sortedMap.putIfAbsent(value, new ArrayList<>());
//            sortedMap.get(value).add(i);
//        }
//
//        long sum = 0;
//        int n2 =n;
//        for (Map.Entry<Integer,List<Integer>> el : sortedMap.entrySet())
//        {
//
//            for ( int i : el.getValue()){
//                if (nums[i]!=-1){
//                    n -= 1;
//                    sum += nums[i];
//                    if (i-1>=0&&nums[i-1]!=-1){
//                        n--;
//                        nums[i-1]=-1;
//                    }
//                    if (i+1<n2&&nums[i+1]!=-1){
//                        n--;
//                        nums[i+1]=-1;
//                    }
//                    nums[i] =-1;
//                }
//                if (n==0) break;
//            }
//            if (n==0) break;
//        }
//        return sum;
//    }

    public long findScore(int[] nums) {
        int n = nums.length;
        boolean[] marked = new boolean[n];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{nums[i], i});
        }

        long sum = 0;

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int value = current[0];
            int index = current[1];

            if (marked[index]) continue;

            sum += value;
            marked[index] = true;

            if (index > 0) marked[index - 1] = true;
            if (index < n - 1) marked[index + 1] = true;
        }

        return sum;
    }

    public static void main(String[] args){
        p2593_FindScoreofanArrayAfterMarkingAllElements solution = new p2593_FindScoreofanArrayAfterMarkingAllElements();

        int[] array = {2,1,3,4,5,2};
        System.out.println(solution.findScore(array));


        int[] array2 = {2,3,5,1,3,2};
        System.out.println(solution.findScore(array2));
    }

}
