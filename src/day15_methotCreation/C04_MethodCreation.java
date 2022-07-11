package day15_methotCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // iki veriablenin toplamini bulan bir methot olustur

        ikiSayiTopla(a, b);
        C02_MethotCreation.ucHarfiTersineCevir("bar");


    }

    public static void ikiSayiTopla(int a, int b) {
        System.out.println("Verilen iki sayinin toplami : " +(a+b));

    }
}
