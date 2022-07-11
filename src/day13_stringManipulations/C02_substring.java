package day13_stringManipulations;

public class C02_substring {
    public static void main(String[] args) {
        // 1-48 of 13454 results for "nutella"
        // bu arama sonucunda bulunan sonuc sayisinin 100 den cok ise super
        // az ise "az sonuc bulundu"

        String str="1-48 of 135464 results for \"nutella\"";
        int ilkSpace= str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);

         String sonuc= str.substring((ikinciSpace+1),ucuncuSpace);
        System.out.println(sonuc); // string olarak 104 verür
        int sinucInt=Integer.valueOf(sonuc);

        if (sinucInt>100){
            System.out.println("Zuperr");
        } else {
            System.out.println("az sonuc bulundu");
        }



    }
}
