package day19_doWhileLoop;

public class C05_Scope {
    // 1-  Bir method iceridsinde olusturulan veriable
    // sadece olusturuldugu methodda kullanilabilir

    // 2-  Tum methodlarin kullanabilemesini istedigimiz veriableler
    // Class icerisinde olusturulur
    // Class levelde olusan veriable
    // --- static olursa tum methodlarda kullanilabilir
    // --- static OLMAZSA (instance) sadece statik olmayan
    // methodlarda kullanilabilir

    // 3-  Loop icinde olusturulan veriableler loop disinda kullanilamaz

    static String kurs="Java";
    int level=10;

    public static void main(String[] args) {

        int sayi=20;
        System.out.println(kurs);

    }

    public static void method1(){
        String isim="Ali Can";
        System.out.println(kurs);

    }

    public void method2(){
        System.out.println(kurs);
        System.out.println(level);

    }
}

