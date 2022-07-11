package day12_stringManipulations;

public class C01_LastindexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime alalim
        //   -girilen kelime cumlede kullanilmamis
        //   -girilen kelime cumlede 1 kere kullanilmis
        //   -girilen kelime cumlede 1 den fazla kullanilmis

        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime= "yeni";

        int ilkKullanim=cumle.indexOf(kelime); // ya bir index verir yada -1 doner
        int sonKullanim=cumle.lastIndexOf(kelime);
        if (ilkKullanim==-1){
            System.out.println("girilen kelime cumlede kullanilmamis");
        } else if (ilkKullanim==sonKullanim){
            System.out.println("-girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("girilen kelime cumlede 1 den fazla kullanilmis");
        }

        String str= "Eclipse";
        System.out.println(str.lastIndexOf("p",4)); // inclusif yani 4 dahil




    }
}
