package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda3_3 {
    public static void main(String[] args) {

        List<String> yemek=new ArrayList<>(Arrays.asList("kusleme", "adana", "trilece", "havucDilem", "buryan", "yaglama", "kokorec", "arabAsi", "guvec"));
        System.out.println("\n  ***   ");
        alfabetikBuyukTekrarsiz(yemek);
        System.out.println("\n  ***   ");
        karakterTersSirali(yemek);
        System.out.println("\n  ***   ");
        sonHarfTersSirali(yemek);

    }

    // Soru; List elemanlarini alfabetik buyuk harf ve tekrarsiz print et

    public static void alfabetikBuyukTekrarsiz(List<String> yemek){
       yemek.stream().map(String::toUpperCase).sorted().distinct().forEach(t-> System.out.print(t + " , "));
    }

    // Soru; List elemanlarinin  karakter sayisini ters sirali olarak tekrarsiz print et

    public static void karakterTersSirali(List<String> yemek){
        yemek.stream().map(t-> t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.print(t+" "));

    }

    // Soru; List elemanlarinin son harfine gore ters sirali print edin

    public static void sonHarfTersSirali(List<String> yemek){
        yemek.stream().
                sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
                forEach(t-> System.out.print(t+" "));

    }

}
