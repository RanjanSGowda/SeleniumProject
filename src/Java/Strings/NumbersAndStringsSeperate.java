package Java.Strings;

//Method 1
public class NumbersAndStringsSeperate {
    public static void main(String[] args) {
        String str="dkh22k42hkhgjh145776";
        String num=str.replaceAll("[^0-9]","");
        String nonNum=str.replaceAll("[^a-zA-Z]","");

        System.out.println("Original String --> "+ str);
        System.out.println("Only Numbers --> "+num);
        System.out.println("Only String --> "+nonNum);
    }
}

//Method 2
//public class NumbersAndStringsSeperate{
//    public static void main(String[] args) {
//        String str="dkh22k42hkhgjh145776";
//
//        String num="";
//        String nonNum="";
//
//        for(char c:str.toCharArray())
//        {
//            if(Character.isDigit(c))
//            {
//                num=num+c;
//            }
//            else {
//                nonNum=nonNum+c;
//            }
//        }
//
//        System.out.println("Original String --> "+ str);
//        System.out.println("Only Numbers --> "+num);
//        System.out.println("Only String --> "+nonNum);
//
//    }
//}

