package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda3_2 {
    public static void main(String[] args) {
        List<Integer> yeniList=new ArrayList<>(Arrays.asList(2,4,5,7,9,8,6,10));

        // Soru; Listteki 5 ten buyuk en kucuk sayiyi print ediniz
        bestenBuyukEnKucuk(yeniList);
        System.out.println("");
        ciftElemanKareSirali(yeniList);
        System.out.println("");
        tekElemanKareSirali(yeniList);

    }
    public static void bestenBuyukEnKucuk(List<Integer> yeniList){
        System.out.println(yeniList.stream().filter(t->t>5 && t%2==1).reduce(Math::min));

    }
       // Soru; Listin cift elemanlarinin karelerini kucukten buyuge siralayin

    public static void ciftElemanKareSirali(List<Integer> yeniList){
        yeniList.stream().filter(Lambda1::ciftBul).map(t->t*t).sorted().forEach(Lambda1::yazdir);

    }

        // // Soru; Listin tek elemanlarinin karelerini buyukten kucuge siralayin
        public static void tekElemanKareSirali(List<Integer> yeniList){
            yeniList.stream().
                    filter(t-> t%2==1).
                    map(t->t*t).
                    sorted(Comparator.reverseOrder()).
                    forEach(Lambda1::yazdir);

        }
}
