package day11_stringManipulation;

import java.util.Locale;

public class C01_ToLowerCaseToUpperCase {
    public static void main(String[] args) {
        String str= "Java Guzeldir";
        // Biz string methotlarini arka arkaya kullanabiliriz
        // Mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        System.out.println(str.toLowerCase().charAt(5)); // g

        // toUpperCase nin Locale Locale olarak kullanimi
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); // JAVA GUZELDİR

    }
}
