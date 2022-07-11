package pratik;

import java.util.Map;
import java.util.Set;

public class MapEntry1 {

    public static void main(String[] args) {

        Map<Integer, String> meineKinder=MaPOlustur.myMap();

       Set<Map.Entry<Integer,String >> meineKinderEntrySet= meineKinder.entrySet();

        System.out.println("No    Isim       Cinsiyet Sac Rengi   Dogum Yeri");
        System.out.println("================================================");

        for (Map.Entry<Integer,String> each: meineKinderEntrySet) {
            Integer entryKey=each.getKey();
            String valuesStr=each.getValue();
            String valueArr[]=valuesStr.split(", ");

            System.out.printf( "%-2d %10s %13s %-10s %-10s\n" , entryKey, valueArr[0], valueArr[1],valueArr[2], valueArr[3]);
           // System.out.println(entryKey +"       "+ valueArr[0]+"      "+ valueArr[1] +"       "+ valueArr[2]+"       "+ valueArr[3]);
        }


    }

}
