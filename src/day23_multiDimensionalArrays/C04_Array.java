package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Array {
    public static void main(String[] args) {
        // Kullaniciya kac elementlik bir array olusturacagini sor
        // Arrayi olustur, elementlrti kullanicidan al ve arraye ata

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istedigini yaziver");

        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array icin " + (i+1) + ". elemani giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
