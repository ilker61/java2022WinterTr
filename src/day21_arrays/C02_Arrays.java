package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

       String arr1[]={"Ali", "Veli", "Ayse"};
       // Array icindeki elemanlara ulasmak icin index kullanilir
        System.out.println(arr1[0]); //Ali

        arr1[1]="Esila";
        System.out.println(arr1[1]);// Esila

        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
       // System.out.println(arr2[5]);//ArrayIndexOutOfBoundsException

        // Arrayin tamamini yazdirmak icin Arrays.toString(Arr) methodu kullanilir

        System.out.println(Arrays.toString(arr2));


        // ikinci yol olarak for loop ta kullanilabilir
        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("");

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));

        System.out.println("");

        System.out.println(Arrays.toString(arr1));


    }
}
