import java.util.Arrays;

public class Q12954 {
    public static void main(String[] args) {
        final int X = 2, N = 5;

//        [2,4,6,8,10]
        System.out.println(Arrays.toString(solution(X, N)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long suming = 0;
        for (int i = 0; i < n; i++) {
            suming += x;
            answer[i] = suming;
        }

        return answer;
    }

    public static long[] solutionB(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++)
            answer[i] = answer[i - 1] + x;

        return answer;
    }
}
