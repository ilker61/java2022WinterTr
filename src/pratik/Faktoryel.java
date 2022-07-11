package pratik;

import java.util.Scanner;

public class Faktoryel {
    public static void main(String[] args) {
        //Soru; (Interview Question
        // Kullanicidan 10 dan kucuk bir tam sayi iste
        // girilen sayinin faktöriyelini bul

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10 dan kucuk bir tam sayi gir");
        int input=scan.nextInt();
        int faktoryel=1;
        for (int i = input; i >=1 ; i--) {
            faktoryel*=i;
        }
        System.out.println(input+"!= "+faktoryel);
    }
}
