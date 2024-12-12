import java.util.Collections;
import java.util.PriorityQueue;

public class p2558_TakeGiftsFromtheRichestPile {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> prq = new PriorityQueue<>(Collections.reverseOrder());

        for (int el: gifts){
            prq.add(el);
        }

        while (k>0) {
            prq.add((int) Math.sqrt(prq.poll()));
            k--;
        }

        long sum = 0;
        while (prq.isEmpty()== false){
            sum += prq.poll();
        }
        return sum;
    }

    public static void main(String[] args){
        p2558_TakeGiftsFromtheRichestPile solution = new p2558_TakeGiftsFromtheRichestPile();
        int[] gifts1 = {25,64,9,4,100};
        System.out.println(solution.pickGifts(gifts1,4));

        int[] gifts2 = {1,1,1,1};
        System.out.println(solution.pickGifts(gifts2,4));
    }
}
