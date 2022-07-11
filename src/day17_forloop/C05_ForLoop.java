package day17_forloop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Kuullanicidan 100 den kucuk bir sayi iste
        // birden baslayarak girilen sayiya kadar 3 un kati olan sayilari yazdie

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi; i++) {

            if (i%3==0){
                System.out.print(i+" ");
            }

        }
    }
}
