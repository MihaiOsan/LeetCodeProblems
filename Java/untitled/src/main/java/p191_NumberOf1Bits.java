public class p191_NumberOf1Bits {
    public int hammingWeight(int n) {
        int sum = 0;
        while (n!=0){
            sum += n%2;
            n/=2;
        }
        return sum;
    }

    public static void main (String[] args){
        p191_NumberOf1Bits solver = new p191_NumberOf1Bits();
        System.out.println(solver.hammingWeight(11));
        System.out.println(solver.hammingWeight(128));
        System.out.println(solver.hammingWeight(2147483645));
    }
}
