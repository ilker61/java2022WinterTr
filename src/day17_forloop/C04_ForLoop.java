package day17_forloop;

public class C04_ForLoop {
    public static void main(String[] args) {
        // 10 ile 30 arasindaki (sayilar dahil) sayilari aralarinda virgul olarak
        // ayni satirda yazdirin

        for (int i = 10; i <30 ; i++) {
            System.out.print(i+ ", ");
        }
        System.out.println("30");

        // YADA     ############################

        int baslangic=10;
        int bitis=30;

        for (int i = baslangic; i <= bitis ; i++) {
            if (i<bitis){
                System.out.print(i+", ");
            } else {
                System.out.print(i);
            }

        }


    }
}
