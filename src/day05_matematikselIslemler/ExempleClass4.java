package day05_matematikselIslemler;

public class ExempleClass4 {
    public static void main(String[] args) {

        //Amazon sayfasina git. nutella arat,
        //sonuc cumlesindeki nutella sayisi 100 den buyukse super yazdir
        //100 den kucukse olmadi bee yazdir canim

        String sonucStr="1-48 von 134 Ergebnissen oder Vorschlägen für \"nutella\"";

        int ilkSpaceIndex=sonucStr.indexOf(" ");
        int ikinciSpaceIndex=sonucStr.indexOf(" ", ilkSpaceIndex+1);
        int ucuncuSpaceIndex=sonucStr.indexOf(" ", ikinciSpaceIndex+1);

        String sayiStr= sonucStr.substring(ikinciSpaceIndex+1, ucuncuSpaceIndex);
        int sayiInt=Integer.valueOf(sayiStr);

        System.out.println(sayiInt);

        if (sayiInt>100){
            System.out.println("Super");
        } else {
            System.out.println("Olmadi bee");
        }






    }
}
