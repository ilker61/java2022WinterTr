package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> isimler= new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); //[Aykut, Yusuf, Ilker, Oguzhan]

        isimler.remove("Oguzhan");
        System.out.println(isimler); //[Aykut, Yusuf, Ilker]

        isimler.remove(0); // 0. index deki objeyi siler
                                 // olmayan bir index silinmeye calisirsa
                                 // hata verir
        System.out.println(isimler); //  [Yusuf, Ilker]






    }
}
