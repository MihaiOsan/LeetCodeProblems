public class MovePiecestoObtainaString_2337 {

    public static boolean canChange(String start, String target) {
        int len = start.length();
        int i = 0, j = 0;

        while (i < len || j < len) {
            while (i < len && start.charAt(i) == '_') i++;
            while (j < len && target.charAt(j) == '_') j++;

      