public class p3370_SmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {
        int cu = 1;
        int nr = 0;
        while (nr < n){
            nr += cu;
            cu *= 2;
        }
        return nr;
    }

    public static void main(String args[]){
        p3370_SmallestNumberWithAllSetBits solution = new p3370_SmallestNumberWithAllSetBits();
        System.out.println(solution.smallestNumber(7));
        System.out.println(solution.smallestNumber(10));
    }
}
