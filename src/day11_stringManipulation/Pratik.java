package day11_stringManipulation;

import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
        // Kullanicidan bir harf ve bir cumle iste
        // Harfin cumlede olup olmadigini yazdir

      Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir cumle gir gozum");
        String cumle=scan.nextLine();


        System.out.println("Lutfen bir harf gir gozum");
        char harf=scan.next().charAt(0);



       System.out.println(cumle.indexOf(harf) ==-1 ? " Harf yoh" :" Harf var");
    }
}
