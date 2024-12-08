import java.util.Arrays;

public class p2054_TwoBestNonOverlappingEvents {

    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));
        int n = events.length;
        int[] maxValues = new int[n];
        maxValues[0] = events[0][2];

        for (int i = 1; i < n; i++) {
            maxValues[i] = Math.max(maxValues[i - 1], events[i][2]);
        }

        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int left = 0, right = i - 1, bestIndex = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (events[mid][1] < events[i][0]) {
                    bestIndex = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            int currentSum = events[i][2];
            if (bestIndex != -1) {
                currentSum += maxValues[bestIndex];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        p2054_TwoBestNonOverlappingEvents solver = new p2054_TwoBestNonOverlappingEvents();
        int[][] events1 = {{1, 3, 4}, {2, 5, 2}, {6, 9, 8}};
        System.out.println(solver.maxTwoEvents(events1));
        int[][] events2 = {{1, 3, 2}, {4, 5, 2}, {6, 7, 4}};
        System.out.println(solver.maxTwoEvents(events2));
    }
}
