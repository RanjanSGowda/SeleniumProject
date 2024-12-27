package Java.Strings;

public class CountVowelsAndConsonentsInString {
    public static void main(String[] args) {
        String str="Ranjan   ";
        //To remove spaces and convert to lowercase
        str=str.replaceAll(" ","").toLowerCase();
        System.out.println("Original String : " + str);


        int vowels=0;
        int consonents=0;

        for(int i=0; i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else
            {
                consonents++;
            }
        }
        System.out.println("Number of Vowels : " + vowels);
        System.out.println("Number of Consonents : " + consonents);

    }
}
