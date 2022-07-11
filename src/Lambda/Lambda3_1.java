package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda3_1 {
    public static void main(String[] args) {
        // Listteki elemanlarin en kucugunu 4 farkli yontem ile print edin
        // 1. yontem Method referance --> Integer class
        // 2. yontem  Method referance --> Math Class
        // 3. yontem Lambda expression
        // 4. yontem  Method referance -->

        List<Integer> yeniList=new ArrayList<>(Arrays.asList(2,4,5,7,9,8,6,10));
        listeninEnKucukElemani1(yeniList);
        System.out.println("");
        listeninEnKucukElemani2(yeniList);
        System.out.println("");
        listeninEnKucukElemani3(yeniList);
        System.out.println("");



    }
    public static void listeninEnKucukElemani1(List<Integer> yeniList){
        System.out.println(yeniList.stream().reduce(Integer::min));

    }

    public static void listeninEnKucukElemani2(List<Integer> yeniList){

        System.out.println(yeniList.stream().reduce(Math::min));
    }

    public static void listeninEnKucukElemani3(List<Integer> yeniList){

        System.out.println(yeniList.stream().reduce(Integer.MAX_VALUE, (a,b) -> a<b ? a:b));
    }


}
