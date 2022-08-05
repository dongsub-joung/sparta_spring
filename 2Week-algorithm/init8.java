// https://school.programmers.co.kr/learn/courses/30/lessons/12933
// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//예를들어 n이 118372면 873211을 리턴하면 됩니다.

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class init8 {
    static Solution8 s8= new Solution8();

    public static void main(String[] args) {
        final long N= 118372;
        resultA(N);
        resultB(N);
        resultC(N);
    }

    static void resultA(long N){
        long result= s8.solution(N);

        System.out.println("Result A");
        showing(result);
    }

    static void resultB(long N){
        long result= s8.solutionB(N);

        System.out.println("Result B");
        showing(result);
    }

    static void resultC(long N){
        long result= s8.solutionC(N);

        System.out.println("Result C");
        showing(result);
    }

    static void showing(long result){
        if (result == 873211){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Solution8{

    //    runtime error
    public long solution(long N){
        String result;
        StringBuffer sb= new StringBuffer();

        String str= String.valueOf(N);
        String[] list= str.split("");

        Arrays.sort(list);

        for(String element: list) sb.append(element);

        result= (sb.reverse().toString());

        return Long.parseLong(result);
    }

    //    runtime error
    public long solutionB(long N){
        String[] list= String.valueOf(N).split("");

        Arrays.sort(list, Collections.reverseOrder());

        StringBuffer sb= new StringBuffer();

        for (String e: list) sb.append(e);

        return Long.parseLong(sb.toString());
    }

    public long solutionC(long N){
        StringBuilder sb = new StringBuilder();
        String.valueOf(N).chars()
                .mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .forEach(ch -> sb.append(ch));

        return Long.parseLong(sb.toString());
    }
}