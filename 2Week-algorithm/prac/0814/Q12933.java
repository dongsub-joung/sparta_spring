import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q12933 {
    public static void main(String[] args) {
//        873211
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        long answer = 0;

        ArrayList<Long> buff= new ArrayList<>();

        while (n > 0){
            buff.add(n%10);
            n/= 10;
        }
        Collections.sort(buff);
        Collections.reverse(buff);

        String str= "";
        StringBuffer stringBuffer= new StringBuffer();
        for (long num: buff)
            stringBuffer.append(String.valueOf(num));

        answer= Long.parseLong(stringBuffer.toString());
        return answer;
    }

    public static long solutionB(long n) {
        String res = "";
        int n = (int) n;
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    public long solutionC(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }

    public int reverseInt(int n){

        String str = Integer.toString(n);
        char[] c = str.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c,0,c.length));
        return Integer.parseInt(((sb.reverse()).toString()));
    }
}
