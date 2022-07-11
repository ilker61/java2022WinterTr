package day11_stringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnorCase {
    public static void main(String[] args) {
        // Kullaniciya derse katilmak isteyip istemedigini sor
        // evet derse "Derse katiliminiz alinmistr" yazdir
        // hayir derse "Sonraki derse nekleruk" yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniz? \n Evet veya Hayir yaziniz");
        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Cevabniz :" + cevap + "\n Derse Katiliminiz Alinmistir" );
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("Cevabiniz : " + cevap + "\n Bir sonraki derse beklerik");
        } else {
            System.out.println("Lutfen gecerli bir cevap girin");
        }

    }
}
