public class init7 {
    public static void main(String[] args) {
        final int N= 12345;
        int[] result1= Solution7.solA(N);
        int[] result2= Solution7.solB(N);

        for (int e: result1) System.out.print(e);
        System.out.println("");
        for (int e: result2) System.out.print(e);
    }
}

class Solution7{
    public static int[] solA(long n){
        String a= "" + n;
        int[] answer= new int[a.length()];

        int idx= 0;
        while (n>0){
            answer[idx]= (int)(n % 10);
            n /= 10;
            idx++;
        }

        return answer;
    }

    public static int[] solB(long n){
        int[] answer;

        String s= String.valueOf(n);

        StringBuffer sb= new StringBuffer(s);
        sb= sb.reverse();

        String[] strarr= sb.toString().split("");

        answer= new int[sb.length()];

        for (int i=0; i< sb.length(); i++)
            answer[i]= Integer.parseInt(strarr[i]);

        return answer;
    }
}
