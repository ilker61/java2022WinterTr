package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaPratik {
    public static void main(String[] args) {
        List<Integer> sayi= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,8,12));

        listiLamdaylaYazdirMethodu1(sayi);
        System.out.println("");
        listiLamdaylaYazdirMethodu2(sayi);

    }

    private static void listiLamdaylaYazdirMethodu1(List<Integer> sayi) {
        sayi.stream().forEach(t-> System.out.print(t+" "));

    }
    private static void listiLamdaylaYazdirMethodu2(List<Integer> sayi) {
        sayi.stream().forEach(System.out::print);

    }

}
