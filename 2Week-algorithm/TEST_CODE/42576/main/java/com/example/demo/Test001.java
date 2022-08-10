package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test001 {
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

