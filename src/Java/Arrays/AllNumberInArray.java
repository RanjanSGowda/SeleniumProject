package Java.Arrays;
import java.util.*;
public class AllNumberInArray {
    public static void main(String args[])
    {
        int arr[] ={1,6,1,3,4,2,1,6};

        Map<Integer, Integer> map= new HashMap<>();

        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        System.out.println("All Numbers in an Array --> " + map);
    }
}
