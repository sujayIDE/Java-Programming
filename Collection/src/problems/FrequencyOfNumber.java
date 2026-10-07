package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 30);

        Map<Integer,Integer> frequency=new HashMap<>();

        for(Integer num:numbers)
        {
            if(frequency.containsKey(num))
            {
                frequency.put(num,frequency.get(num)+1);
            }else{
                frequency.put(num,1);
            }
        }

        System.out.println(frequency);
    }
}
