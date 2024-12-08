namespace Csharp;

public class p191_NumberOf1Bits
{
    public int hammingWeight(int n) {
        int sum = 0;
        while (n!=0){
            sum += n%2;
            n/=2;
        }
        return sum;
    }
    
    public static void Main()
    {
        p191_NumberOf1Bits solution = new p191_NumberOf1Bits();
        System.Console.WriteLine(solution.hammingWeight(11));
        System.Console.WriteLine(solution.hammingWeight(128));
        System.Console.WriteLine(solution.hammingWeight(2147483645));
    }
}