package day03_scanner;

public class ExempleClass2 {
    public static void main(String[] args) {
        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

       int sayi1=10;
       int sayi2=20;
        System.out.println("SWAP tan once sayi1= " +sayi1 + " , sayi2= "+sayi2);

       int taklaciGuvercin=sayi1;
       sayi1=sayi2;
       sayi2=taklaciGuvercin;

        System.out.println("SWAP tan sanra sayi1= " + sayi1 + " , sayi2= "+sayi2);





    }
}
