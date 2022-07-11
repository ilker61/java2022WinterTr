package day05_matematikselIslemler;

import java.util.Locale;
import java.util.Scanner;

public class ExempleClass3 {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=30;

        b=++a;

        c=a++;

        System.out.println(b + " , " + a + " , " + c);

        int d=b;
        System.out.println(b);


        int num= 12;
        num=num-3;
        System.out.println(num);


        String str1= "deli mavi deniz";

        System.out.println(str1.substring(5, 9));
        System.out.println(str1.charAt(str1.length()-1));

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin");
        String kelime=scan.nextLine();

        System.out.println(kelime.charAt(kelime.length()-1));





    }
}
