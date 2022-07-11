package pratik;

import java.util.HashMap;

public class Map3HarfSayisiBulma {
    //Soru; Verilen bir Stringteki harfleri
    // ve bu harflerin kac kere yazildigini retorn eden bir methot yazin
    //input="Karamollaogullari"
    static String harfler = "Karamollaogullari";

    public static void main(String[] args) {

        System.out.println(harfSaymaMethodu("Karamollaogullari"));

    }

    private static HashMap<String, Integer> harfSaymaMethodu(String karamollaogullari) {
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