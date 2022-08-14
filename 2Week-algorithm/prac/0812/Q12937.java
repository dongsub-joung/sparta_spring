public class Q12937 {
    public static String solution(int num) {
        String answer = "";
        if (num % 2 == 0)
            answer= "Even";
        else
            answer= "Odd";
        return answer;
    }

    public static String solutionB(int num) {
        String answer = "";
        answer= (num % 2 == 0) ? "Even" :"Odd";
        return answer;
    }
}
