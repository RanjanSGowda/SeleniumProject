package Java.Strings;

//Using inbuilt method

//public class UpperToLower {
//    public static void main(String[] args) {
//        String str="RANJANKUMAR S S";
//        String output =str.toLowerCase();
//        System.out.println("Original String --> "+ str);
//        System.out.println("Output String --> "+output);
//    }
//}


//Without using inbuilt methods

public class UpperToLower {
    public static void main(String[] args) {
        String str="RANJANKUMAR S S";
        String output="";

        //ASCII value of a-z = 97-122
        //ASCII value of A-Z = 65-90

        for (char c:str.toCharArray())
        {
            if(c>='A'&c<='Z')
            {
                output=output+(char)(c+32);
            }
            else {
                output=output+c;
            }
        }

         System.out.println("Original String --> "+ str);
         System.out.println("Output String --> "+output);
    }
}

