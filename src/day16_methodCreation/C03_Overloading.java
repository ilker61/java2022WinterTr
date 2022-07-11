package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {
        //soru= verilen iki sayiyi toplayip yazdiran method olustur

        int sayi1=10;
        int sayi2=20;

        ikiSayiTopla(sayi1, sayi2);

        // iki double sayiynin toplamini yazdiran bir method olusturalim

        double sayi3=15.2;
        double sayi4=10.3;

        ikiSayiTopla(sayi3, sayi4);

        // eger veriable ulusturmadan direk sayilari yazarak method call yaparsam

        ikiSayiTopla(15, 25); // int toplami verir
        ikiSayiTopla(10.5, 12.3); // double toplami verr

        // bir integer ile bir double toplamini yazdiran bir method olusturalim

        int sayi5=3;
        double sayi6=3.2;

        ikiSayiTopla(sayi5,sayi6);


        // Interview sorusu; OVERLOADING NEDUR?
        // el Cevab; Eger bir Class da ismi ayni fakat parametreleri farkli
        // olan methotlar olusturursak buna Overloading denir
        // JAVA AYNI ISIMDE VE AYNI PARAMETREDE (HERSEYIYLE AYNI) METHOD
        // OLUSTURULMASINA IZIN VERMEZ
        // METHOD SIGNATURE (METOT IMZASI) DEGISMESI GEREKIR
        // method signature= isim+patametre+argument  yani hepsi birden
        // method return type degistirmek, access modifier degistirmek veya
        // static kelimesini eklemek method signature degistirmez

    }
    private static void ikiSayiTopla(int sayi3, double sayi4) {
        System.out.println("bir int ve bir double toplami : " + (sayi3+sayi4));
    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println("iki double toplami : " + (sayi3+sayi4));
    }

    public static void ikiSayiTopla(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : " + (sayi1+sayi2));
    }
}
