package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin
        // islemi bitirmek icin 0 a basmmasini soyleyin
        // Kullanici yanlislikla negatif sayi girerse o sayiyi dikkate alma
        // "Negatif sayi giremezsin la ayi" yazdir ve basa don
        // Kullanici 0 a bastiginda kac pozitif sayi girdigini
        // kac negatif sayi girdigini
        // girdigi pozitif sayilarin toplaminin kac oldugunu yazdir

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int pozitifSayac=0;
        int negatifSayac=0;

        do {
            System.out.println("Pozitif sayi gir loo \nbitirmek istediginde 0 a bas loo");
            sayi= scan.nextInt();
            if (sayi<0){
                System.out.println("Negatif sayi giremezsin la ayi");
                negatifSayac++;
            } else if (sayi>0){
                toplam+=sayi;
                pozitifSayac++;
            }

        }while (sayi!=0);
        System.out.println("girilen pozitif sayilarin toplami = " +toplam);
        System.out.println("girilen negatif sayi adeti = " +negatifSayac);
        System.out.println("girilen pozitif sayi adeti = " +pozitifSayac);
    }
}
