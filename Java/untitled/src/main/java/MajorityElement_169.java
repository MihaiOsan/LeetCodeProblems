import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            if (map.keySet().contains(i))
                map.put(i,map.getOrDefault(i,1)+1);
            else
                map.put(i,1);
        }
        int ma=-1,nma=-1;
        for (int x : map.keySet()){
            int curr = map.get(x);
            if (curr > ma){
                ma = curr;
                nma=x;
            }
        }
        return nma;
    }

    public static void main(String[] args){
        int nums[]={1,2,3,3,3,3 ,1,1, 2};
        System.out.println(majorityElement(nums));
    }
}
