package day05_matematikselIslemler;

public class ExempleClass1 {
    public static void main(String[] args) {
        int sayi=123;

        System.out.println(sayi%10);

        String str1="2345";
        String str2="123456";
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));

        int a=15;
        int b=a++;
        System.out.println(b);
        System.out.println("yeni durum" + b);
        b++;
        System.out.println("son durum"  + b);

    }
}
