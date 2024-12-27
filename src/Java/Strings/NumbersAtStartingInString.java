package Java.Strings;

import org.apache.http.io.SessionOutputBuffer;

public class NumbersAtStartingInString {
    public static void main(String[] args) {
        String str="anka234114jljkj02h9";

        String num="";
        String nonNum="";

        for(char c:str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                num=num+c;
            }
            else {
                nonNum=nonNum+c;
            }
        }
        System.out.println("Original String --> "+ str);
        System.out.println("Output String --> "+ num + nonNum);
    }
}
