package day16_methodCreation;

public class C01_MethidIleSifreKontrol {
    public static void main(String[] args) {
        // Soru; Kullanicidan bir sifre iste
        // asagidaki sartlari saglarsa "Sifre basari ile tanimlandi" yazdir
        // Sartlar saglanamazsa "islem basarisiz, lutfen yenni bir sifre girin loo"
        // -ilk harf buyuk olmali
        // -son harf kucuk olmali
        // -sifre bosluk icermemeli
        // -sifre uzunlugu en az 8 karakter olmali

        String sifre="asdfg";
        boolean ilkHarf=ilkHarfKontrolEt(sifre);
        boolean sonHarf=sonHarfKontrolEt(sifre);
        boolean boslukKontrol= boslukKontrolEt(sifre);
        boolean uzunlukKontrol= uzunlukKOntrolEt(sifre);

        if (ilkHarf && sonHarf && boslukKontrol && uzunlukKontrol){
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz tekrar deneyiniz");
        }
    }

    public static boolean uzunlukKOntrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        } else {
            System.out.println("sifrenin en az 8 karakteri olacahh");
        }
        return uzunlukKontrolSonuc;
    }

    public static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;

        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;

        } else {
            System.out.println("sifre bosluh icermeyecaahh");
        }
        return boslukKontrolSonuc;
    }

    public static boolean sonHarfKontrolEt(String sifre) {
        char sonHarf=sifre.charAt(sifre.length()-1);
        boolean sonHarfSonuc=false;
        if (sonHarf>='a' && sonHarf<='z'){
            sonHarfSonuc=true;
        }else {
            System.out.println("sifrenin ilk harfi buyuk olacahhh");
        }
        return sonHarfSonuc;
    }

    public static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;
        if (ilkHarf>='A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        }else {
            System.out.println("sifrenin ilk harfi buyuk olacahhh");
        }
        return ilkHarfSonuc;
    }
}
