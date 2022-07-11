package pratik;

import java.util.HashMap;
import java.util.Map;

public class Map2harfSayisiBulma {
    //Soru; Verilen bir Stringteki harfleri
    // ve bu harflerin kac kere yazildigini retorn eden bir methot yazin

    static String harfler = "kucukhasanogullari";

    public static void main(String[] args) {

        System.out.println(harfSaymaMethodu("kucukhasanogullari"));

    }

    public static HashMap<String, Integer> harfSaymaMethodu(String kucukhasanogullari) {

        HashMap<String, Integer> harflerMap = new HashMap<>();
        String harflerArr[] = harfler.split("");

        for (String each : harflerArr) {
            if (!harflerMap.containsKey(each)) {
                harflerMap.put(each, 1);
            } else {
                harflerMap.put(each, harflerMap.get(each) + 1);
            }

        }
        return harflerMap;

    }
}
