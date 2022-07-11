package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Array {
    public static void main(String[] args) {
        // verilen bir arraye yeni bir element ekleyen bir method olusturun

        int arr[]={1,2,3};
        int eklenecekEleman=4;

        arr=arrayeElemanEkle(arr,eklenecekEleman);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekEleman) {
        int yeniArr[]=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
       yeniArr[yeniArr.length-1]=eklenecekEleman;

        return yeniArr;
    }
}
