import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class init10 {
    public int[] solA(int[] arr){
        if (arr.length == 1)
            return new int[]{-1};

        int min= Integer.MAX_VALUE;
        for (int a: arr)
            if (min>a)
                min=a;

        int[] newArr= new int[arr.length-1];
        int idx= 0;
        for (int a: arr)
            if (min != a)
                newArr[idx++]= a;

        return newArr;
    }

    public int[] solB(int[] arr){
        if (arr.length <= 1)
            return new int[]{-1};

        int min= Integer.MAX_VALUE;
        List<Integer> list= new ArrayList<>();
        for (int i=0; i< arr.length; i++){
            list.add(arr[i]);
            if (min > arr[i])
                min= arr[i];
        }

        list.remove(list.indexOf(min));
        int[] new_arr= new int[list.size()];
        for (int i=0; i< new_arr.length; i++)
            new_arr[i]= list.get(i);

        return new_arr;
    }

    public int[] solC(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int min= IntStream.of(arr).min().getAsInt();
        return IntStream.of(arr).filter(
                i -> i != min
        ).toArray();
    }
}
