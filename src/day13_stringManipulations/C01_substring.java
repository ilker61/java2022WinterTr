package day13_stringManipulations;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";
        System.out.println(str.substring(5));// ile IT cok guzel

        // Yukaridaki stringi "Mehmet Hoca ile IT cok guzel" yapalim

        System.out.println(str.replace("Java", "Mehmet Hoca")); // 1. yol
        System.out.println("Mehmet Hoca"+ str.substring(5)); //2. yol

        System.out.println(str.substring(9));// yazilan index inclusive

        // eger bir index ten sona kadar olan bir parcayi degil
        // belli bir parcayi almak istersek iki parametre yazmaliyiz
        // 2 parametre str.substring(baslangic index, bitis index) yazmaliyiz
        // baslanguc indexi inclusive dir ama bitis indexi exclusive dir

        System.out.println(str.substring(0,5)); // Java
        System.out.println(str.substring(0,1)); // J
        System.out.println(str.substring(0,0)); // bosluk verir
        //System.out.println(str.substring(5,2));// StringIndexOutOfBoundsException
        // Bitis indexi baslangictan kucuk olamaz
        System.out.println(str.substring(str.length()-1));// l==> son harfi verir

        // **************

        // Son 5 harfi yazdir
        System.out.println(str.substring(str.length()-5)); //guzel







    }
}