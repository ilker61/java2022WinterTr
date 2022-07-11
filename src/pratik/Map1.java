package pratik;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Map1 {
    public static void main(String[] args) {

       Map<Integer, String> meineKinderMap=MaPOlustur.myMap();

       //********* ======== *************
        //   KEY ICIN ASAGIDAKI ISLEMLER YAPILIR

       Set<Integer> kinderSet= meineKinderMap.keySet();
        // burada Set olusturmadan direkt asagidaki kod blogu da kullanilabilirdi
       //List<Integer> keyList = new ArrayList<>();
        // keyList.addAll(sinifList.keySet());
        List<Integer> kinderKeyList=new ArrayList<>();
       kinderKeyList.addAll(kinderSet);


        // ********* VALUES  ICIN ASAGIDAKI ISLEMLER YAPILIR

       Collection<String> kinderValueColl=meineKinderMap.values();
       List<String> kinderValuesList= new ArrayList<>();
       kinderValuesList.addAll(kinderValueColl);

       // Oncelikle bir Collection olusturulur (25. satir)
        //Ardindan bu collection bir liste aktarilir (26.satir)
        //addAll() methodu kullanilarak Collection liste aktarilir
        // Daha sonra bir MDArray create edilir
        // Ama bunun icin OUTER VE INNER array BOYUTLARINI bilmem lazim
        // bunun icin int outerArrayBoyut, ve int innerArrayBoyut isimli iki veriable olusturulur

        int outerArrayBoyut= kinderValuesList.size();

        // inner array boyutu biraz daha komplex
        // bunun icin ilk value alinir. bunun lengt i alinir

        String ilkValue=kinderValuesList.get(0);
        // ilkValue su anda strin halde. bunu array haline getirmek icin
        //split() methodu kullanilir
        String ilkValueArray[]= ilkValue.split(", ");

        int innerArrayBoyut= ilkValueArray.length;

        String valueMDArr[][]= new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]=kinderValuesList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {

            valueMDArr[i][j]=temp[j];
            }
        }

        System.out.println("No      Isim      Cinsiyet     SacRengi     Dogum Yeri");
        System.out.println("=================================================");
        for (int i = 0; i < kinderKeyList.size(); i++) {
            System.out.print(kinderKeyList.get(i) + "        ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j]+"      ");
            }
            System.out.println("");
            
        }














    }
}
