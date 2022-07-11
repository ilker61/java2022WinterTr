package day15_methotCreation;

public class C05_MethodCreation {
    public static void main(String[] args) {

        // string i yazdiran bir method create edelim
        // hosgeldiniz diyen bir method olusturalim
         // kapanma mesaji yazan method yaz

        hosgeldinMethot();

    }

    private static void kapanmaMethot() {
        System.out.println("Bizi tercih ettiginiz icun danke");
    }

    public static void hosgeldinMethot() {
        System.out.println("Hosgeldin");
        stringiYazdir("java gun gectikce guzellesiyor");
    }

    private static void stringiYazdir(String str) {
        System.out.println(str);
        kapanmaMethot();
    }
}
