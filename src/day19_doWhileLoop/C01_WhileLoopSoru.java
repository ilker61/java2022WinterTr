package day19_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoopSoru {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        // ve toplam kac tan eolduklarini yazdirin

       Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi gir loo");
        int input=scan.nextInt();

        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.print(bolen+" ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input + "sayisini bolen "+ sayac + " tane sayi var");

    }
}
