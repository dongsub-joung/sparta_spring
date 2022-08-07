public class init12 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(13));
    }

    public static boolean solution(int a) {
        boolean answer = true;
        int sum= 0;
        int x= a;

        while (x >= 1){
            sum+= x%10;
            x/= 10;
        }

        answer= (a % sum ==0 ) ? true : false;
        return answer;
    }
}
