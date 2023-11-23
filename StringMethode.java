import java.util.Arrays;

public class StringMethode {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "AbCdEfGh";
        String str3 = "ABCDEFGH";
        String str4 = "abcdefgh";

        if(str2.equals(str4)) System.out.println("1. True");
        if(str2.equalsIgnoreCase(str4)) System.out.println("2. True");

        String upperStr4 = str4.toUpperCase();
        boolean chkStr = upperStr4.contains("ABC") ? true : false;
        System.out.println(chkStr);

        //split
        String data = "abc,a,b,c,d";
        String[] splitData = data.split(",");
        System.out.println(Arrays.toString(splitData)); //[abc, a, b, c, d]

        //substring
        String name = "chanadee hk";
        int subStr = name.indexOf(" ");
        System.out.println(subStr); //8
        System.out.println(name.substring(0, subStr)); //chanadee

        //trim
        String trimStr = "  a b c  ";
        System.out.println(trimStr.trim()); //a b c
        System.out.println(trimStr.replaceAll("\\s", "")); //
        
    }
}
