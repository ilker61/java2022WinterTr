package day22_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_Split {
    public static void main(String[] args) {
        // Verilen bir cumlede istenen harfin kac defa
        // kullanildigini yazdiran method yaz

        String cumle="Nerede o hello word yazdiramayan ogrenciler?";
        String harf="o";

        tekrarliHarfBulma(cumle, harf);


    }

    private static void tekrarliHarfBulma(String cumle, String harf) {
    String arr[]= cumle.replace(" ", "").split("");
        List<String> listArr=new ArrayList<>(Arrays.asList(arr));
        int sayac=0;

        for (int i = 0; i < listArr.size(); i++) {
            if (listArr.get(i).equals(harf)){
                sayac++;
            }
        }
        System.out.println("Cumlede "+sayac+ " tane "+ "'"+harf+"'" + " harfi vardir");
    }
}
