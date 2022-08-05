public class init9 {
    public static void main(String[] args) {
        final long N1= 121;
        final long N2= 3;

        long r1= Solution9.solA(N1);
        long r2= Solution9.solA(N2);
        System.out.println(r1 + "," + r2);

    }
}

class Solution9{
    public static long solA(long n){
        long result;
        int sqrted= (int) Math.sqrt(n);
        if (Math.pow(sqrted, 2) == n){
            double added_sqrt= Math.sqrt(n) + 1;
            result= (long) Math.pow(added_sqrt, 2);
            return result;
        }

        return -1;
    }
}