package pratik;public class StringtenParcaAlma {
    public static void main(String[] args) {
        // 1-48 of 13454 results for "nutella"
        // bu arama sonucunda bulunan sonuc sayisinin 100 den cok ise super
        // az ise "az sonuc bulundu"

        String str="1-48 of 135464 results for \"nutella\"";

        int ilkSpace=str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ", ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ", ikinciSpace+1);

        String sonuc= str.substring(ikinciSpace+1, ucuncuSpace);

        int sonucInt=Integer.valueOf(sonuc);

        if (sonucInt<100){
            System.out.println(" durumlar vahim");
        } else {
            System.out.println(" bele devam et bro");
        }


    }
}
