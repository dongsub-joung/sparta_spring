public class Init26 {
    public static void main(String[] args) {
        int left=13, right=17;
//                43
        System.out.println(solution(left,right));

        int left2=24, right2=27;
//    52
        System.out.println(solution(left2, right2));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<=right; i++){
            int cnt= 0;
            for (int j= 1; j<=right; j++){
                if (i%j == 0)
                    cnt++;
            }
            if (cnt % 2 == 0)
                answer += i;
            else
                answer-= i;
        }
        return answer;
    }
}
