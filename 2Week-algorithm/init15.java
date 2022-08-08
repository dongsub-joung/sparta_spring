import java.util.ArrayList;

public class init15 {
    public static void main(String[] args) {
        int[] DATA= {1,1,3,3,0,1,1};

        int[] result= solution(DATA);
        for (int e: result) System.out.print(e);
    }

    public static int[] solution(int []arr) {
        int[] answer;
        ArrayList<Integer> list= new ArrayList<>();
        int value= -1;

        for (int i=0; i<arr.length; i++){
            int target= arr[i];
            if (target != value){
                list.add(target);
                value= target;
            }
        }

        answer= list.stream().mapToInt(
                i -> i
        ).toArray();
        return answer;
    }
}
