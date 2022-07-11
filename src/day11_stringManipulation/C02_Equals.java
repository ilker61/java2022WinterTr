package day11_stringManipulation;

public class C02_Equals {
    public static void main(String[] args) {
        String str1= "Ali Can";
        String str2= "Ali" + " Can";
        System.out.println("str1 : " + str1);
        System.out.println("str1 : " + str1);

        System.out.println("iki esit ile karsilastir :" + (str1==str2)); // true
        System.out.println("equals ile karsilastir :" + str1.equals(str2));// true

        String str3= str1+"";
        System.out.println("str3 : " + str3);
        System.out.println("iki esit ile karsilastir :" + (str3==str2)); // falce
        System.out.println("equals ile karsilastir :" + str3.equals(str2));  // true

        // String de 00 her zaman dogru sonuc vermeyebilir
        // Bunun icin String icin genelde equals kullanmak tercih edilmelidir

    }
}
