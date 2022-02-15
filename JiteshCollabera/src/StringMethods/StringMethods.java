package StringMethods;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s1="abcdefghijk";
        String s2="abcd";
        //containsOf
        System.out.println(s1.contains(s2));

        //indexOf
        System.out.println(s1.indexOf(s2));

        //lastIndexOf
        System.out.println(s1.lastIndexOf(s2));

        //compareTO
        System.out.println(s1.compareTo(s2));

        //concat
        System.out.println(s1.concat(s2));

        //lowerCase
        System.out.println(s1.toLowerCase());

        //UpperCase
        System.out.println(s1.toUpperCase());

        //splitMethod
        String sa[]=s1.split(" ");
        System.out.println(s1);

        //replaceTo
        System.out.println(s1.replace('a','x'));

        //toLength
        System.out.println(s1.length());

        //subString
        System.out.println(s1.substring(0));

        //trim
        System.out.println(s1.trim());
    }




}
