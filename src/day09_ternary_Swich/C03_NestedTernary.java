package day09_ternary_Swich;

public class C03_NestedTernary {
    public static void main(String[] args) {

    // Verilen sayinin + veya - oldugunu kontrol eden
        // 0 veya + ise tek veya cift oldugunu
        // - ise -100 den buyuk veya kucuk oldugunu
        // tespit eden Ternary kod yazin

        int sayi=-120;

        String sonuc= sayi>=0 ? (sayi%2==0 ? "pozitif cift sayi" : " pozitif tek sayi") : ( sayi<-100 ? "-100 den kucuk negatif sayi": "-100 den buyuk negatif sayi");

        // Nested Ternary de yukaridaki gibi parantez olmasa da olur
        // OCA Ternary sorularinda genelde kodda parantez olmaz

        System.out.println(sonuc);

    }
}
