package day07_IfElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
  // Kullanicidan yasini iste
  // 65 ve ustu ise emekli olabilirsin yazdir
  // degilse emekli olamazsin yazdir

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas>=65) {
            System.out.println("Emekli olabiluuun");
        } else {
            System.out.println("Emekli olamannn");
            System.out.println( 65-yas + " yil daha calismalisin gozum ");
        }



    }


}
