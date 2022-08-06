import java.util.ArrayList;

public class init13 {
    public static void main(String[] args) {
        int DATA1= 45, DATA2= 125;
        initA(DATA1,DATA2);
        initB(DATA1,DATA2);
    }

    static void initA(int DATA1, int DATA2){
        int R1= Sol13.solA(DATA1);
        int R2= Sol13.solA(DATA2);
        System.out.println(R1+ "," + R2);
    }
    static void initB(int DATA1, int DATA2){
        int R1= Sol13.solA(DATA1);
        int R2= Sol13.solA(DATA2);
        System.out.println(R1+ "," + R2);
    }
}

class Sol13 {
    protected static int solA(int N){
        String answer= new String();

        while (N>=3){
//            answer는 문자열 (문자열에 쌓임)
            answer= answer + (N%3);
            N/= 3;
        }
        answer+= N;

//        Stirng 전체를 하나의 정수로 인식하는 듯
        return Integer.parseInt(answer, 3);
    }

    protected static int solB(int N){
        int answer= 0;
        ArrayList<Integer> list= new ArrayList<>();

//        10 -> 3
        while (N != 0){
            list.add(N%3);
            N/= 3;
        }

//        3 -> 10
        int tmp= 1;
//        index 끝부터 처음까지
        for (int i=list.size()-1; i>=0; i--){
            answer+= list.get(i) * tmp;
            tmp *= 3;
        }

        return answer;
    }
}
