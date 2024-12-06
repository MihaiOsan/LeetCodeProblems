public class p605_CanPlaceFlowers {
    public static void main(String[] args){
        int[] flowerbed = {1,0,0,0};
        System.out.println(canPlaceFlowers(flowerbed,1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int spots = 1, sum = 0;
        for (int i : flowerbed){
            if (i == 0)
                spots++;
            else
            {
                sum+=(spots - 1)/2;
                spots = 0;
            }
        }
        if (flowerbed[flowerbed.length-1]==0)
            sum+=spots/2;
        return sum >= n;
    }
}
