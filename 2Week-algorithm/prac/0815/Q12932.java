import java.util.ArrayList;
import java.util.Arrays;

public class Q12932 {
    public static void main(String[] args) {
//                [5,4,3,2,1]
        System.out.println(Arrays.toString(solution(12345)));
    }
    public static int[] solution(long n) {
        ArrayList<Long> arrayList= new ArrayList<>();
        while (n>0){
            arrayList.add(n%10);
            n/= 10;
        }
        int[] answer = new int[arrayList.size()];
        for (int i=0; i<arrayList.size(); i++)
            answer[i]= arrayList.get(i).intValue();
        return answer;
    }

    public static int[] solutionB(long n) {
        return new StringBuilder().append(n).reverse().chars().map(
                Character::getNumericValue
        ).toArray();
    }

    public static int[] solutionC(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i=0; i<ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }
        return answer;
    }
}
