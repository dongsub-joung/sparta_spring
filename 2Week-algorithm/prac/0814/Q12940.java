public class Q12940 {
    public static void main(String[] args) {
//        3,12
        System.out.println(solution(3, 12));
//        1,10
        System.out.println(solution(2, 5));
    }

//    A way
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]= gcd(n,m);
        answer[1]= (n*m) / answer[0];
        return answer;
    }

    public static int gcd(int p, int q){
        if (q == 0) return p;
        return gcd(q, p%q);
    }
}
