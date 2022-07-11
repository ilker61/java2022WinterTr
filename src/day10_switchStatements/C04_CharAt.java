package day10_switchStatements;

public class C04_CharAt {
    public static void main(String[] args) {
        // Stringtr herhangi bir karakteri almak istedigimizde
        // o harfin indexini yazarak alabiliriz
        // str1.charAt(istenen index)

        String str1= "Java Cok Guzel";

        // J yi yazdiralim
        System.out.println(str1.charAt(0)); // J

        // G yi yazdiralim
        System.out.println(str1.charAt(9)); // G

        // va yazdiralim
        System.out.println("" + str1.charAt(2) + str1.charAt(3)); // va

        // cOK seklinde yazdiralim

        System.out.println("" + str1.toLowerCase().charAt(5)+str1.toUpperCase().charAt(6)+str1.toUpperCase().charAt(7)); // cOK

        // Son harfi yazdir

        System.out.println(str1.charAt(str1.length()-1)); // l







    }
}
