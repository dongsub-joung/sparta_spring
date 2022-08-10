// https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.Arrays;

public class Init27 {
    public static void main(String[] args) {
        final int[] D= {1,3,2,5,4};
        final int BUDGET= 9;
//    3
        System.out.println(solution(D, BUDGET));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i= 0; i<d.length; i++){
            budget-= d[i];
            if (budget<0) break;

            answer++;
        }
        return answer;
    }
}
