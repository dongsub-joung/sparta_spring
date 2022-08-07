import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class init16 {
    public static void main(String[] args) {

    }

//    ArrayList
    public static int[] solution(int[] numbers) {
        int[] answer;
        ArrayList<Integer> list= new ArrayList<>();

        for (int i=0; i<numbers.length; i++){
            for (int j=i+1; j< numbers.length; j++){
                int a= numbers[i]+numbers[j];
                if (list.indexOf(a) < 0)
                    list.add(a);
            }
        }

        answer= new int[list.size()];
        for (int i= 0; i<list.size(); i++)
            answer[i]= list.get(i);

        Arrays.sort(answer);
        return answer;
    }

//    HashSet
    public static int[] solutionB(int[] numbers) {
        int[] answer;
        Set<Integer> set= new HashSet<>();

        for (int i=0; i<numbers.length; i++){
            for (int j= i+1; j< numbers.length; j++)
                set.add(numbers[i] + numbers[j]);
        }

        answer= set.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
