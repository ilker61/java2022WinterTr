package day17_forloop;

public class C06_ForLoop {
    public static void main(String[] args) {
        // verilen iki harf ve aralarindaki harfleri yazdiran bir kod yazdiriniz

        char ilkHarf='m';
        char sonHarf='t';

        for (char i = ilkHarf; i <=sonHarf ; i++) {

            System.out.print(i+" ");

        }

        System.out.println("");

        double baslangig=10;
        double bitis= 20;
        double artis= 0.5;
        // baslangic ve bitis arasindaki tum sayilari artisa gore yazdir loo

        for (double i = baslangig; i <=bitis ; i+=artis) {
            System.out.print(i+" ");

        }
    }
}
