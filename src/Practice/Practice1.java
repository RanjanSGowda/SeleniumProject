package Practice;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        //1
//        String str="radar";
//        String reverse="";
//
//        for(int i =str.length()-1;i>=0; i--)
//        {
//            reverse=reverse+str.charAt(i);
//        }
//        System.out.println(reverse);
//
//        if(str.equals(reverse))
//        {
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a Palindrome");
//        }

        //2
//
//        String str="aabbbxssdf";
//        char target='b';
//        int count=0;
//
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==target)
//            {
//                count++;
//            }
//        }
//        System.out.println(count);


        //3
//        String str="I Like Cricket and IPL";
//        int count=1;
//
//        for(int i=1;i<str.length()-1;i++)
//        {
//            if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        //4
//
//        String str="i Like Java";
//        String[] outpout=str.split(" ");
//        for(int i=outpout.length-1;i>=0;i--)
//        {
//            System.out.println(outpout[i]);
//        }

        //5
//        int num=5;
//        int fact=1;
//
//        for(int i=1;i<=num;i++)
//        {
//            fact=fact*i;
//        }
//        System.out.println(fact);

        //6
//        int num=585;
//        int original=num;
//        int rev=0;
//
//        while(num!=0) {
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//            num = num / 10;
//        }
//        System.out.println(rev);
//        if(original==rev)
//        {
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a Palindrome");
//        }

        //7
//        int num = 109;
//        int sum = 0;
//
//        while (num != 0) {
//            int rem = num % 10;
//            sum = sum + rem;
//            num = num / 10;
//        }
//        System.out.println(sum);

        //8
//        int num=5;
//        int first=0,sec=1,temp;
//
//        for(int i=0;i<=num;i++)
//        {
//            System.out.print(first + " ");
//            temp=first+sec;
//            sec=first;
//            first=temp;
//        }

        //9
//        int num=10;
//        int flag=0;
//        for(int i=1;i<=num/2;i++)
//        {
//            if(num%i==0)
//            {
//                System.out.println("not prime  " + num);
//                flag=1;
//                break;
//
//            }
//        }
//        if(flag==0)
//        {
//            System.out.println("prime");
//        }

        //9
//        int [] arr={1,2,3,7,5,6};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        for (int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                int temp;
//                if(arr[i]<arr[j]) //if(arr[i]>arr[j])
//                {
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        //10
        int[] arr1 = {1, 24, 5, 6, 7, 2};
        int[] arr2 = {1, 6, 3, 1, 6, 2};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i:arr1)
        {
            set1.add(i);
        }

        for(int i:arr2)
        {
            set2.add(i);
        }

        set1.retainAll(set2);
        System.out.println(set1);
    }
}
