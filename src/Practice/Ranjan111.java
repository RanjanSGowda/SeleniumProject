package Practice;

import java.util.*;

public class Ranjan111 {
    public static void main(String[] args)
    {
        int[] a={1,1,2,3,4,4};
        int[] b={3,6,7,97,547,3,1,4,2,4,1,3,2,997,2,5,1};

        String s="Ranjanaaa";

        String rev="";

        for(int i=s.length()-1;i>=0;i--)
        {
         rev=rev+s.charAt(i);
        }
        System.out.println(rev);

        char[] ch=s.toCharArray();
        char target='a';
        int count=0;



        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==target)
            {
                count++;
            }
        }
        System.out.println(count);

        Set<Integer> set1=new TreeSet<>();
        Set<Integer> set2=new TreeSet<>();

        for(int i:a)
        {
            set1.add(i);
        }
        for(int j:b)
        {
            set2.add(j);
        }
        set1.retainAll(set2);
//        System.out.println(set1);

        Set<Integer> set=new TreeSet<>();
        for(int k:a)
        {
            set.add(k);
        }
//        System.out.println(set);


        Map<Integer, Integer> map=new HashMap<>();

        for(int l:b)
        {
            map.put(l,map.getOrDefault(l,0)+1);

        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }


      /*
        Sort the array
        Reverse the array
        add two array
        Duplicate b/w two array
        Largest & Smallest num in an Array
        Secong Largest & Smallest num in an Array
        common ele in an array
        sum of array
        avg of array
        */

//        sum of array
//         int sum=0;
//
//         for(int i:a)
//         {
//             sum=sum+i;
//         }
//        System.out.println(sum);
//
////        ..Avg of an array
//
//        int len=a.length;
//        int avg=sum/len;
//        System.out.println(avg);
//
////        sort the array
//        int temp=0;
//
//        for(int i=1;i<a.length;i++)
//        {
//            for (int j=i+1;j<a.length;j++)
//            {
//                while (a[i]>a[j])
//                {
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//            System.out.print(a[i]);
//        }

    }
}
