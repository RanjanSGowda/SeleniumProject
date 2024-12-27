package Practice;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        //1
//        int n=153;
//        int result=0;
//        int orginalnum=n;
//
//        while (n!=0)
//        {
//            int rem=n%10;
//            result+=Math.pow(rem,3);
//            n=n/10;
//        }
//
//        if(result==orginalnum)
//        {
//            System.out.println("Amstrong");
//        }
//        else {
//            System.out.println("Non Amstrong");
//        }

        //2

//        int num=4;
//        int fact=1;
//
//        for(int i=1;i<=num;i++)
//        {
//            fact=fact*i;
//        }
//        System.out.println(fact);

        //3
//        int num=5;
//        int firstNum=0,secNum=1,temp;
//
//        for(int i=0;i<=num;i++)
//        {
//            System.out.print(firstNum + " ");
//            temp=firstNum+secNum;
//            firstNum=secNum;
//            secNum=temp;
//        }

        //4
//        int num=1238888;
//        int count=0;
//
//        while (num!=0)
//        {
//            num=num/10;
//            count++;
//        }
//        System.out.println(count);

        //5

//        int num=1234;
//        int originalNum=num;
//        int reverse=0;
//
//        while (num!=0)
//        {
//            int rem=num%10;
//            reverse=reverse*10+rem;
//            num=num/10;
//
//        }
//        System.out.println(reverse);
//        if(originalNum==reverse)
//        {
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a Palindrome");
//        }

        //6
//        int num=5;
//        int flag=0;
//
//        for(int i=2;i<=num/2;i++)
//        {
//            if (num%i==0)
//            {
//                flag=1;
//                break;
//            }
//        }
//        if(flag==0)
//        {
//            System.out.println("It's a Prime Number");
//        }
//        else {
//            System.out.println("It's not a Prime Number");
//        }

        //7
//        int num=123;
//        int sum=0;
//
//        while (num!=0)
//        {
//            int rem=num%10;
//            sum=sum+rem;
//            num=num/10;
//        }
//        System.out.println(sum);

        //8
//        int a=10,b=20,temp;
//        a=a+b;
//        b=a-b;
//        a=a-b;

//        a=a^b;
//        b=a^b;
//        a=a^b;

//        temp=a+b;
//        a=temp-a;
//        b=temp-b;
//
//        System.out.println(a);
//        System.out.println(b);

        //9
//        String str="aabbaacck";
//        char target='b';
//        int count=0;
//        int ln=str.length()-str.replaceAll("a", "").length();
//        System.out.println(ln);
//
//        for(int i=0;i<=str.length()-1;i++)
//        {
//            if(str.charAt(i)==target)
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        //10
//        String str="ranjan";
//        int vowel=0;
//        int cons=0;
//
//        for(int i=0;i<=str.length()-1;i++)
//        {
//            char c=str.charAt(i);
//            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//            {
//                vowel++;
//            }
//            else
//            {
//                cons++;
//            }
//        }
//        System.out.println(vowel);
//        System.out.println(cons);

        //11
//        String str="I like Cricket in Sports";
//        int count=1;
//
//        for(int i=0;i<=str.length()-1;i++)
//        {
//            if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        // 12
//        String str="ranjan";
//        String rev="";
//        char[] ch=str.toCharArray();
////        for(int i=str.length()-1;i>=0;i--)
////        {
////            rev=rev+str.charAt(i);
////        }
////        System.out.println(rev);
//
//        for(int i=ch.length-1;i>=0;i--)
//        {
//            System.out.print(ch[i]);
//        }

        //13
//        String str="ranjan";
//
//       Set<Character> set=new LinkedHashSet<>();
//
//       for(char c: str.toCharArray())
//       {
//           set.add(c);
//       }
//       StringBuilder sb=new StringBuilder();
//       for (char c: set)
//       {
//           sb.append(c);
//       }
//        System.out.println(sb.toString());

//        int[] arr1 = {1,2,4,3,5};
//        int start=0, temp;
//        int end=arr1.length-1;
//
//        while (start<end)
//        {
//            temp=arr1[start];
//            arr1[start]=arr1[end];
//            arr1[end]=temp;
//
//            start++;
//            end--;
//        }
//
//        for (int num:arr1)
//        {
//            System.out.print(num);
//        }
//
//        int[] arr={1,3,5,2,7,6};
//
//        System.out.println(Arrays.toString(arr));
//
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1; j<arr.length;j++)
//            {
//                int temp=0;
//                if(arr[i]>arr[j])
//                {
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));

//        int lar=arr[arr.length-1];
//        System.out.println(lar);
//        int sml=arr[0];
//        System.out.println(sml);
//        int seclar=arr[arr.length-2];
//        System.out.println(seclar);
//        int secsml=arr[1];
//        System.out.println(secsml);

//        int[] arr= {1,3,2,6,4,8,7,9};
//        int start=0;
//        int end=arr.length-1;
//        int temp=0;
//
//        while (start<end)
//        {
//            temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int n:arr)
//        {
//            System.out.print(n + " ");
//        }

//        for(int i=0;i<arr.length;i++)
//        {
//            for (int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int lar=arr[arr.length-1];
//        System.out.println(lar);
//        int sml=arr[0];
//        System.out.println(sml);
//        int seclar=arr[arr.length-2];
//        System.out.println(seclar);
//        int secsml=arr[1];
//        System.out.println(secsml);

        int[] a1={1,2,3,4,4};
        int[] a2={3,6,5,3};
//
//        Set<Integer> set=new LinkedHashSet<>();
//
//        for(int i:a1)
//        {
//            set.add(i);
//        }
//        for (int i:a2)
//        {
//            set.add(i);
//        }
//
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int num:set)
//        {
//            System.out.println(num);
//        }
        Set<Integer> set1=new LinkedHashSet<>();
        Set<Integer> set2=new LinkedHashSet<>();

        for(int num:a1)
        {
            set1.add(num);
        }
        for (int num: a2)
        {
            set2.add(num);
        }
        set1.retainAll(set2);
        System.out.println(set1);



//        int[] a={1,2,3,4,4};
//        int sum=0;
//        for (int num:a)
//        {
//            sum=sum+num;
//        }
//        System.out.println(sum);

        int[] a={1,2,4,5,6};
        int start=0;
        int end=a.length-1;

        while(start<end)
        {
            int temp=0;
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));

        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++) {
                int temp = 0;
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }


    }
}
