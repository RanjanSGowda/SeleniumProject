package Java.Strings;

public class RemoveRegExpInString {
    public static void main(String[] args) {
        String str="1128337725425422335567899865Ranjan292022~?><~}~!:@<@::@l@><@>@<";

       str= str.replaceAll("[0-9~?><~}~!:@<@::@l@><@>@<   ]","");
        System.out.println(str);
    }
}
