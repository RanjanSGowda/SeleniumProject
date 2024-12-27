package Java.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String name="Ranjan";
        String reverse="";
        char[] ch=name.toCharArray();

        //Method 1
        StringBuilder sb=new StringBuilder("Ranjan");
        System.out.println(sb.reverse());

        //Method 2
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);


        //Method 3
        System.out.print(reverse);
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }


    }
}
