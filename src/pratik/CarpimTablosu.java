package pratik;

public class CarpimTablosu {
    public static void main(String[] args) {
        // kullanicidan bir rakam alip carpim taplosu olusturalim
        int input=3;

        // 1 2 3
        // 2 4 6
        // 3 6 9

        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j) + " ");
            }
            System.out.println("");
        }

    }
}