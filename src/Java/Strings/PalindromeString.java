package Java.Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String name="rad0867ar";
        String reverse="";

        for(int i=name.length()-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
        }

        if(name.equals(reverse))
        {
            System.out.println("The given String " + reverse + " is Palindrome");
        }
        else
        {
            System.out.println("The given String " + reverse + " is not a Palindrome");

        }
    }
}
