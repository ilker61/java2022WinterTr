package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]

        // set methodu verilen index deki elemani siler ve parametre olarak yazilan
        // elemani listeye dahil ediverir

        isimler.set(1, "Seckin");
        System.out.println(isimler); //[Aykut, Seckin, Ilker, Oguzhan]

        List<String> logListesi= new ArrayList<>();

        logListesi.add(isimler.set(2, "Cosmos"));

        System.out.println(isimler);  //  [Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesi);   //  [Ilker]

    }
}
