import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap= new HashMap<>();

        for (var player: participant)
            hashMap.put(player, hashMap.getOrDefault(player,0) + 1);
        for (var player: completion)
            hashMap.put(player, hashMap.get(player) -1);

        for (var key: hashMap.keySet()){
            if (hashMap.get(key) != 0)
                answer= key;
        }
        return answer;
    }

    public String solutionB(String[] participant, String[] completion) {
        Map<String, Long> partiMap= Arrays.asList(participant).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (var name: completion){
            Long value= partiMap.get(name) - 1L;

            if (value == 0L)
                partiMap.remove(name);
            else
                partiMap.put(name,value)
        }

        return partiMap.keySet().iterator().next();
    }
}
