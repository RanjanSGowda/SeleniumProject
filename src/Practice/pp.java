package Practice;

import java.util.HashMap;
import java.util.Map;

public class pp {
    public static void main(String[] args) {
        int [] a={1,2,3,4,3,9,875,1,4};

        Map<Integer,Integer>map= new HashMap<>();

        for(int aa:a)
        {
            map.put(aa,map.getOrDefault(aa,0)+1);
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() +" ==> "+ entry.getValue());
            }
        }
    }
}
