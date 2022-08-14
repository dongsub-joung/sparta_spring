public class Q12934 {
    public static void main(String[] args) {
//        144
        System.out.println(solution(121));
    }

    public static long solution(long n) {
        long answer = 0;
        for (long i=2; i<= n/2; i++){
            if (i*i == n){
                long num=(i+1);
                answer= num*num;
                break;
            }else {
                answer= -1;
            }
        }
        return answer;
    }

    public long solutionB(long n) {
        long answer;

        Double sqrt= Math.sqrt(n);
        answer= sqrt == sqrt.longValue() ? (long) Math.pow(sqrt+1, 2) : -1;

        return answer;
    }
}
