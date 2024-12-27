package Java.Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str="aabbc";
        int count=1;
        char currentChar=str.charAt(0);
        StringBuilder compress=new StringBuilder();

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==currentChar)
            {
                count++;
            }
            else
            {
                compress.append(count);
                compress.append(currentChar);
                currentChar=str.charAt(i);
                count=1;
            }
        }
        compress.append(currentChar);
        compress.append(count);
        System.out.println(compress.toString());


    }
}
