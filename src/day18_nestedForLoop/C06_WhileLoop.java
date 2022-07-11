package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan iki tam sayi al
        // bu sayilar ve arasindaki tum sayilari yazdiran bir kod yazdir

        int baslangic=40;
        int bitis=60;

        //1. YOL

        for (int i = baslangic; i <= bitis ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");

        // 2. YOL

        int i=baslangic;
        while (i<=bitis){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);


    }
}
