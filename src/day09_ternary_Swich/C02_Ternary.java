package day09_ternary_Swich;

public class C02_Ternary {
    public static void main(String[] args) {
        int sayi=4527;
        //verilen sayinin 3 ve ya daha cok basamakli
        // olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olustur

        String sonuc=sayi>100 ? "Sayi 3 veya daha cok basamakli" : "Sayi negatif veya 3den daha az basamakli";
        // Ternary bize sonuc dondurur. o nedenle ya bunu bir veriableye atamaliyiz
        // yada sonucu yazdirmaliyiz

        System.out.println("Gidiginiz sayi analizi = "+sonuc);



    }
}
