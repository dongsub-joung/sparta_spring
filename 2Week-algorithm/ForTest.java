import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ForTest {
    public static void main(String[] args) {
//        Test002 t2= new Test002();
//        t2.init();

//        Test003 t3= new Test003();
//        t3.init();

//        Test004 t4= new Test004();
//        t4.init();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
class Test004{
    public  void init(){
        final int N= 12345;
        for (int e: solution(N)) System.out.printf(""+e);
    }

    public int[] solution(long n) {
        ArrayList<Integer> array_list= new ArrayList<>();
        int[] answer;
        int idx= 0;
        while (n>0){
            array_list.add((int) n % 10);
            n/= 10;
        }
        answer= new int[array_list.size()];
        for (int i=0; i< array_list.size(); i++){
            answer[i]= array_list.get(i);
        }
        return answer;
    }
}


// https://school.programmers.co.kr/learn/courses/30/lessons/12931
class Test003{
    public  void init(){
        final int N= 123, N2= 987;
//        6
        System.out.println(solution(N));
//        24
        System.out.println(solution(N2));
    }

    public int solution(int n) {
        int answer = 0;
        while (n > 0){
            answer+= n % 10;
            n/= 10;
        }

        return answer;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/12930
class Test002{
    public  void init(){
        final String STR= "try hello world";
        System.out.println(solution(STR));
        System.out.println(solutionB(STR));
    }
    public String solution(String s) {
        String answer = "";
        String[] strs= s.split("");
        int idx= 0;
        for (int i=0; i< strs.length; i++){
            if (strs[i].equals(" "))
                idx= 0;
            else if (idx % 2 == 0){
                strs[i]= strs[i].toUpperCase();
                idx++;
            }else{
                strs[i]= strs[i].toLowerCase();
                idx++;
            }
            answer+= strs[i];
        }
        return answer;
    }

    public String solutionB(String s) {
        String answer = "";

        int cnt=0;
        String[] strs= s.split("");
        for (String str: strs){
            cnt= str.contains(" ") ? 0 : cnt + 1;
            answer+= cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
}

//    https://school.programmers.co.kr/learn/courses/30/lessons/42576
class Test001{
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map= new HashMap<>();

        for (String player: participant)
            map.put(player, map.getOrDefault(player, 0)+1);

        for(String player: completion)
            map.put(player, map.get(player) - 1);

        Iterator<Map.Entry<String, Integer>> iter= map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, Integer> entry= iter.next();
            if (entry.getValue() != 0){
                answer= entry.getKey();
                break;
            }
        }
        return answer;
    }

    public String solutionB(String[] participant, String[] completion) {
        String answer= "";
        HashMap<String, Integer> hash_map= new HashMap<>();
        for (String player: participant)
            hash_map.put(player, hash_map.getOrDefault(player, 0 ) + 1);
        for (String player: completion)
            hash_map.put(player, hash_map.get(player) - 1);

        for (String key: hash_map.keySet()){
            if (hash_map.get(key) != 0)
                answer= key;
        }
        return answer;
    }
}

