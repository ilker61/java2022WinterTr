package day06_concatenation_Operatort;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);// false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc1); //true

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc2);  // false

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3);  // false

        /*
        && ve & arasindaki fark= eger cift && kullanilirsa java calismaya baslar,
        ilk false buldugunda koodun calismasini durdurur oysa tek & kodun sonuna kadar calistirir

         */


        int sayi4= 15;
        // soru= sayi4 un 10 ile 20 arasinda oldugunu true olarak dondurun

        System.out.println(sayi4<=20 && sayi4>=10);  // true

        int sayi5=5;
        // Soru= sayi5 in  10 ile 20 arasinda olmadigini true diyerek dondurelim

        System.out.println(!(sayi5<=20 && sayi5>=10));  //true
        System.out.println(sayi5<=20 || sayi5>=10);  // true








    }
}
