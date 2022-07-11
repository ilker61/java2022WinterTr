package day09_ternary_Swich;

public class C04_Ternary {

    // Bazen Ternary deki iki data turu birbirinden farkli olabilir

    // Soru ; verilen sayi 100 den buyukse sayinin karesini al ve yazdir
    // 100 den kucukse "sayi 100 den buyuk olmali" yazdiran
    // bir Ternary olusturalim
    public static void main(String[] args) {

    int sayi=110;

        // Asagidaki ternary de iki farkli data turunde (integer ve String) sonuc var
        // Bu nedenle bunu bir veriableye atayamayiz.
        // Bu tur durumlarda yapilacak tek sey yazdirmaktur

        System.out.println(sayi>100 ? sayi*sayi : " Sayi 100 den buyuk olmali");

    }

}
