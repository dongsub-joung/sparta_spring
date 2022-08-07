// https://school.programmers.co.kr/learn/courses/30/lessons/77484#fnref1


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class init17 {
    public static void main(String[] args) {

    }

    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map= new HashMap<>();
        int zero_count= 0;

        for (int lotto: lottos){
            if (lotto == 0){
                zero_count++;
                continue;
            }
            map.put(lotto, true);
        }

        int same_count= 0;
        for (int win_num: win_nums){
            if (map.containsKey(win_num))
                same_count++;
        }

        int max_rank= 7 - (same_count+zero_count);
        int min_rank= 7 - (same_count);

        if (max_rank>6)
            max_rank=6;
        if (min_rank >6)
            min_rank=6;

        return new int[]{max_rank, min_rank};
    }

    public int[] solutionB(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int answer = 0;
        int hidden = 0;

        Arrays.sort(win_nums);
        for (int i = 0; i < lottos.length; i++)
            if (Arrays.binarySearch(win_nums, lottos[i]) > -1)
                answer++;
            else if (lottos[i] == 0)
                hidden++;

        return new int[] {rank[answer + hidden], rank[answer]};
    }
}
