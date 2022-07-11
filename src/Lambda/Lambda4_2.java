package Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda4_2 {
    public static void main(String[] args) {
         /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 arklı obj'den List create ediniz.
           pojo class==> plan old java object --> model class
 */
        Universite bogazici=new Universite("bogazici" ,"matematik", 571, 93 );
        Universite itu=new Universite("istanbul teknik" ,"matematik", 622, 81 );
        Universite istanbul=new Universite("istanbul" ,"hukuk", 1453, 71 );
        Universite marmara=new Universite("marmara" ,"bilgisayar muh", 1071, 77 );
        Universite ytu=new Universite("yildiz teknik" ,"gemi", 333, 74 );

        List<Universite> unv =new ArrayList<>(Arrays.asList(bogazici, itu, istanbul,marmara,ytu));

        System.out.println(notOrt74Kontrol(unv)); //
        System.out.println(ogrSayilariniTerstenSirala(unv));
        System.out.println("");
        notOrtGoreIlkUcUni(unv);
        System.out.println("");
        enAzOgrenciSayi(unv);
        System.out.println("");
        System.out.println(notOrtAtmisUctenBykUnvogrenciSayiTopla(unv));
        System.out.println("");
        System.out.println(notOrtAtmisUctenBykUnvogrenciSayiToplaMapToInt(unv));


    }
    // Soru; Not ortalamalarinin 74 den buyuk oldugunu kontrol eden pr create edin

    public static boolean notOrt74Kontrol(List<Universite> unv){

          return unv.stream().allMatch(t-> t.getNotOrt()>74);
    }

    // Soru; ogrenci sayilarinin 110 dan az olmadigini kontrol et
    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.

    public static boolean ogrcSayisi110AzMi(List<Universite> unv) {
        return unv.
                stream().
                allMatch(t -> t.getOgrenciSayisi() > 110);
    }

    //Soru= universitelerin herhangi birinde matematik olup olmadigini kontrol et

    public static boolean matBolumVarmi(List<Universite> unv) {
        return unv.stream().
                anyMatch(t -> t.getBolum().contains("mat"));
    }

    // task4= universiteleri ogr sayilarina gore byk den kck sirala

    public static List<Universite> ogrSayilariniTerstenSirala(List<Universite> unv){

        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).
                collect(Collectors.toList());

    }

    //task5--> uni lerin not ort. gore b-->k ilk ucunu print et

    public static void notOrtGoreIlkUcUni(List<Universite> unv){

        System.out.println(unv.
                stream().
                sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).collect(Collectors.toList()));
    }

    //task6--> ogrenci sayisi en az olan 2. uni yazdirsana la

    public static void enAzOgrenciSayi(List<Universite> unv){
        System.out.println(unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrenciSayisi)).limit(2).
                skip(1).collect(Collectors.toList()));
    }

    //task7--> not ort 63 den buyuk olanlarin ogrenci sayilarini toplamini print et

    public static int notOrtAtmisUctenBykUnvogrenciSayiTopla(List<Universite> unv){
        return unv.
                stream().
                filter(t->t.getNotOrt()>63).map(t-> t.getOgrenciSayisi()).
                reduce(0,(a,b)->a+b);

    }

    //7. sorunun MaptoInt methodu ile cozumu

    public static int notOrtAtmisUctenBykUnvogrenciSayiToplaMapToInt(List<Universite> unv){
        return unv.
                stream().
                filter(t->t.getNotOrt()>63).mapToInt(t-> t.getOgrenciSayisi()).sum();


    }



}
