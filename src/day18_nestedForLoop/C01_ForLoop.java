package day18_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //Soru; (Interview Question
        // Kullanicidan 10 dan kucuk bir tam sayi iste
        // girilen sayinin faktöriyelini bul

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10 dan kucuk tam sayi gir");
        int input=scan.nextInt();
        int faktoryel=1;
        String faktoryelAcikYazim="";

        for (int i = input; i >=1; i--) {
            faktoryel*=i;
            if (i==input){
                faktoryelAcikYazim=faktoryelAcikYazim+i;
            } else {
                faktoryelAcikYazim=faktoryelAcikYazim+"*"+i;
            }

        }
        System.out.println(input+"!= "+faktoryelAcikYazim+" ="+faktoryel);

    }
}
