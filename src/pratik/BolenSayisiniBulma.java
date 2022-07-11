package pratik;

import java.util.Scanner;

public class BolenSayisiniBulma {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        // ve toplam kac tan eolduklarini yazdirin

        int bolen=1;
        int sayac=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int input=scan.nextInt();

        while (bolen<=input){
            if (input%bolen==0){
                System.out.print(bolen+ " ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");

        System.out.println(input+ " sayisini bolen "+sayac+" adet sayi var");
    }
}
