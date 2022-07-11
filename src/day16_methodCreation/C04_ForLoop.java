package day16_methodCreation;

import java.util.*;

public class C04_ForLoop {
    public static void main(String[] args) {
        // verilen bir stringi tersten yazdiran bir code yaz
        String str= "Valla bu java cok zevkli";

        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.substring(i, i+1));
        }

    }
}
