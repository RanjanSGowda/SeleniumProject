package Java.Strings;

//Using inbuilt method

//public class LowerToUpper {
//    public static void main(String[] args) {
//        String str=" ranjankumar s s";
//        String output=str.toUpperCase();
//        System.out.println("Original String --> "+ str);
//        System.out.println("Output String --> "+output);
//    }
//}

//Without using inbuilt methods

public class LowerToUpper {
    public static void main(String[] args) {
        String str=" ranjankumar s s";
        String output="";

        for(char c:str.toCharArray())
        {
            if(c>='a'&c<='z')
            {
                output=output+(char)(c-32);
            }
            else
            {
                output=output+c;
            }
        }
        System.out.println("Original String --> "+ str);
        System.out.println("Output String --> "+output);
    }
}