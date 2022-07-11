package pratik;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> myMap= new HashMap<>();
        myMap.put(101, "Ali, Can; Java");
        myMap.put(102, "Veli, Yan, Java");
        myMap.put(103, "Ali, Yan, C#");

        System.out.println(myMap);
        System.out.println(myMap.keySet());
        Set<Integer> myKeySet= myMap.keySet();
        Collection<String> myValuesSet=myMap.values();
        System.out.println(myValuesSet);

    }
}
