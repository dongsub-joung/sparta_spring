public class Q12947 {
    public static void main(String[] args) {
        final int X= 18;

//        true
        System.out.println(solution(X));
    }

    public static boolean solution(int x) {
        boolean answer;
        int sum=0;
        int num= x;

        while (num > 0){
            sum+= (num%10);
            num/= 10;
        }

        answer= (x % sum) == 0 ? true : false;

        return answer;
    }

    public static boolean solutionB(int x) {
        boolean answer;
        int num= x;
        String[] temp= String.valueOf(num).split("");

        int sum=0;
        for (String str: temp)
            sum+= Integer.parseInt(str);

        answer= (num%sum) == 0 ? true : false;
        return answer;
    }

    public static boolean solutionC(int num) {
        int sum = 0;

        sum = 0;
        Integer.toString(num).chars().forEach(c -> sum += c - '0');
        return num % sum == 0;
    }
}
