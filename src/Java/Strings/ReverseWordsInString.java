package Java.Strings;

public class ReverseWordsInString {
public static void main(String[] args) {
    String str="I like java";
    String[] output=str.split(" ");

    for(int i=output.length-1;i>=0;i--)
    {
        System.out.print(output[i] + " ");
    }
}
}


