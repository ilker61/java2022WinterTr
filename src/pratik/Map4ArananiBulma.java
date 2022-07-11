package pratik;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Map4ArananiBulma {

    //Soru; Verilen map te istenen programlama dilini bilen kisileri
    // list olarak donduren bir method yaz
    // map==> input= {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
    //istenen dil: JAVA
    //Sonuc= [Ali, Veli]



    public static void main(String[] args) {

        HashMap<Integer, String> verilenMap=new HashMap<>();
        verilenMap.put(101, "Ali, Can, Java");
        verilenMap.put(102, "Veli, Yan, Java");
        verilenMap.put(103, "Ali, Yan, C#");
        System.out.println(verilenMap);

        String istenenDil="JAVA";

        List<String> istenenList= istenenDiliBulmaMethodu(verilenMap, istenenDil);
        System.out.println(istenenList);

    }

    private static List<String> istenenDiliBulmaMethodu(HashMap<Integer, String> verilenMap, String istenenDil) {

        List<String> istenenNihaiListe= new ArrayList<>();


        for (String each: verilenMap.values()) {
           String arr[]=each.split(", ");
            if (arr[2].equalsIgnoreCase(istenenDil)){
                istenenNihaiListe.add(arr[0]);
            }

        }

        return istenenNihaiListe;

    }


}
