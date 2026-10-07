package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindElementAppearesMoreThanOne {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30, 60);

        Map<Integer,Integer> frequency=new HashMap<>();

        for(Integer num:numbers)
        {
            if (frequency.containsKey(num))
            {
                frequency.put(num,frequency.get(num)+1);
            }else{
                frequency.put(num,1);
            }

            if(frequency.get(num)>1)
            {
                System.out.println(num);
                break;
            }
        }
    }
}
