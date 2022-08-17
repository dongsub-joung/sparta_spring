import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q12906 {
    public static void main(String[] args) {
        int[] arr= {1,1,3,3,0,1,1};

//         	[1,3,0,1]
        printArray(solution(arr));
        printArray(solutionB(arr));

    }

    private static void printArray(int[] solution) {
        for (var e: solution) System.out.print(e);
        System.out.println();
    }

    //    wrong ways to solve on description
    public static int[] solution(int []arr) {
        HashSet<Integer> hashSet= new HashSet<>();
        var iter= Arrays.stream(arr).iterator();
        while (iter.hasNext()){
            hashSet.add(iter.next());
        }
        int[] answer = new int[hashSet.size()];
        int idx= 0;
        for (var e: hashSet){
            answer[idx++]= e;
        }
        return answer;
    }

    public static int[] solutionB(int []arr) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        int pre= Integer.MAX_VALUE;
        for (int n: arr){
            if (pre != n)
                arrayList.add(n);
            pre= n;
        }
        int[] answer = new int[arrayList.size()];
        for (int i=0; i< answer.length; i++)
            answer[i]= arrayList.get(i);
        return answer;
    }

    public static int[] solutionC(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int val= -1;
        for (var e: arr){
            if (e != val){
                answerList.add(e);
                val= e;
            }
        }
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
