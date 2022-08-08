//https://school.programmers.co.kr/learn/courses/30/lessons/81301
//네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

public class init22 {
    public static void main(String[] args) {
        String A= "one4seveneight";

//        1478
        System.out.println(solution(A));
    }
    public static int solution(String s) {
        int answer;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i=0; i<10; i++)
            s= s.replace(num[i], Integer.toString(i));

        answer= Integer.parseInt(s);
        return answer;
    }

}
