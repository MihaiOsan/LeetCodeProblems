public class AddBinary_67 {
    public static void main(String[] args){
        String a = "10101";
        String b = "111";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b){
        int lenA = a.length(), lenB = b.length();
        String sum = "";
        int rest = 0;
        char zero ='0';
        while (lenA > 0 && lenB > 0){

            int aux = (a.charAt(lenA-1)) -zero + b.charAt(lenB-1) -zero + rest;
            sum = aux%2 + sum;
            if (aux >=2)
                rest = 1;
            else
                rest = 0;
            lenA--;
            lenB--;
        }
        while (lenA > 0){
            int aux = a.charAt(lenA-1) -zero + rest;
            sum = aux%2 + sum;
            if (aux >=2)
                rest = 1;
            else
                rest = 0;
            lenA--;
        }

        while (lenB > 0){
            int aux = b.charAt(lenB-1) -zero + rest;
            sum = aux%2 + sum;
            if (aux >=2)
                rest = 1;
            else
                rest = 0;
            lenB--;
        }

        if (rest > 0)
            sum = rest + sum;

        return sum;
    }
}
