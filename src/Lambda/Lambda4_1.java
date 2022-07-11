package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda4_1 {
    public static void main(String[] args) {

        List<String> yemek=new ArrayList<>(Arrays.asList("kusleme", "adana", "trilece", "havucDilim", "buryan", "yaglama", "kokorec", "arabAsi", "guvec"));

        charKaresiCiftEleman(yemek);
        System.out.println("\n   ###   ");
        karakterSayisiYediMi(yemek);
        System.out.println("\n   ###   ");
        wIleBaslayanElemanKontrol(yemek);
        System.out.println("\n   ###   ");
        xIleBitenKontrol(yemek);
        System.out.println("\n   ###   ");
        enBuyukKarakterliYazdir(yemek);
        System.out.println("\n   ###   ");
        sonHarfeGoreSiralailkElemanHaric(yemek);

    }
    // Soru; Listin elemanlarinin karakterlerinin cift sayili karelerini hesaplayan
    // karelerini tekrarsiz buyukten kucuge yazdirin

    public static void charKaresiCiftEleman( List<String> yemek){

        yemek.stream().map(t-> t.length()*t.length()).filter(Lambda1::ciftBul).distinct().sorted(Comparator.reverseOrder()).forEach(Lambda1::yazdir);

    }

    // List elemanlarinin karakter sayiyisni 7 ve 7 den az oldugunu kontrol edin

    public static void karakterSayisiYediMi(List<String> yemek){
        boolean Kontrol=yemek.stream().allMatch(t-> t.length()<=7);

        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7) ? "List elemanlari 7 ve daha az harften olusur" : " List elemanlari 7 harften olusur");
    }

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.


    //  Soru; List elemanlarinin w ile baslamasini kontrol edin

    public static void wIleBaslayanElemanKontrol(List<String> yemek){
        System.out.println(yemek.stream().noneMatch(t -> t.startsWith("w")) ? "hic w li yemek olurmu": "w ile baslayan yemek var");
    }

    public static void xIleBitenKontrol(List<String> yemek){
        System.out.println(yemek.stream().anyMatch(t -> t.endsWith("x")) ? "x ile biten ve ýa bitenler var" : "Hic x ile biten yumah yog");
    }

    // Karakter sayisi en buyuk olani yazdir

    public static void enBuyukKarakterliYazdir(List<String> yemek){
        System.out.println(yemek.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).findFirst());

    }


    // List elemanlarini son harfine gore siralayip ilk eleman haric kalan elemanlari proint ediniz

    public static void sonHarfeGoreSiralailkElemanHaric(List<String> yemek){
        yemek.
                stream().
                sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
                skip(1).
                forEach(t-> System.out.print(t + " "));
    }


    //skip(1) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
// Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür. Bu, durum bilgisi olan bir ara işlemdir.
//skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.



//limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
// şekilde kesilmiş bir akış return eder. Stream return eder.

    /*
  TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz. Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray())); kullanılabilir.

   */

}
