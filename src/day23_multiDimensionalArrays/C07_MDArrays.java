package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {
        // Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen bir cumle gir loo");

        String cumle= scan.nextLine();

        String arr[]=cumle.split(" ");
        System.out.println(arr.length);

    }
}
