// https://school.programmers.co.kr/learn/courses/30/lessons/87389
// 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
public class init30 {
    public static int solutionA(int n) {
        for (int i= 2; i<n; i++){
            if (n%i == 1)
                return i;
        }
        return -1;
    }

    public static int solutionB(int n) {
        int x= 1;
        while (n%x != 1)
            x++;
        return x;
    }
}
