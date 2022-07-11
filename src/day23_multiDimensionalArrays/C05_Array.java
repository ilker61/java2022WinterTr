package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Array {
    public static void main(String[] args) {
        // verilen bir arraye yeni bir element ekleyen bir method olusturun

        int arr[]={3,4,7};

        // 9 ekleyelim

        // bir arraye icinde hazir elementlerin oldugu yeni bir array atramak isterseniz
        // bunu {1,2,3} seklinde degil de
        // new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz bir arrayi
        // assign ederek yapabiliriz

        int arrYeni[]= {3,4,7,9};

        arr=arrYeni;

        System.out.println(Arrays.toString(arr));


    }
}
