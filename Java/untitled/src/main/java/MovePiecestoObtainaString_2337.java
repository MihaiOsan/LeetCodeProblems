public class MovePiecestoObtainaString_2337 {

    public static boolean canChange(String start, String target) {
        int len = start.length();
        int i = 0, j = 0;

        while (i < len || j < len) {
            while (i < len && start.charAt(i) == '_') i++;
            while (j < len && target.charAt(j) == '_') j++;

            if (i == len && j == len) return true;
            if (i == len || j == len) return false;

            char c = start.charAt(i);

            if (c != target.charAt(j)) return false;

            if (c == 'L' && i < j) return false;
            if (c == 'R' && i > j) return false;

            i++;
            j++;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(canChange("R_L_","__LR"));
    }
}
