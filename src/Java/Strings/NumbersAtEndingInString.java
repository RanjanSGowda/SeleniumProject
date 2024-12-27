package Java.Strings;

public class NumbersAtEndingInString {
    public static void main(String[] args) {
        String str="831jhdahjg2827397hgdkjdh";

        String num="";
        String nonNum="";

        for(char c:str.toCharArray())
        {
            if(Character.isLetter(c))
            {
                nonNum=nonNum+c;
            }
            else {
                num=num+c;
            }
        }

        System.out.println("Original String --> "+ str);
        System.out.println("Output String --> "+nonNum+num);
    }
}
