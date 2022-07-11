package pratik;

import java.util.Arrays;

public class TerstenYazdirma {
    public static void main(String[] args) {
        String isim="Ilker Kucukaslan";
        String isimTesr="";

        for (int i = isim.length()-1; i >=0 ; i--) {
            isimTesr+=isim.charAt(i);
        }
        System.out.println(isimTesr);

        int arr[]={6,9,8,2,3,4,7,1,1,0,9,10};

        terstenCevir(arr);


    }

    private static void terstenCevir(int[] arr) {
        Arrays.sort(arr);
        int arrTers[]=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrTers[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arrTers));
    }


}

