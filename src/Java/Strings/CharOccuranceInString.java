package Java.Strings;

public class CharOccuranceInString {
    public static void main(String[] args) {
        String str="aabbsddfffnnnnnnnnnnn";
        char target='n';

        //Method 1
        char[] ch=str.toCharArray();
        int count=0;

        for(int i=0;i<=ch.length-1;i++)
        {
            if(ch[i]==target)
            {
                count++;
            }
        }
        System.out.println(count);

        //Method 2

        int charCount=str.length()-str.replace("n","").length();
        System.out.println(charCount);


    }
}
