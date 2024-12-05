import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckIfNandItsDoubleExist_1346 {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int el : arr){
            if (set.contains(el*2))
                return true;
            else {
                set.add(el*2);
                if (el%2==0)
                    set.add(el/2);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {19,2,5,3};
        System.out.println(checkIfExist(arr));
    }

}
