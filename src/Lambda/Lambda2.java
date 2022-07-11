package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda2 {
    public static void main(String[] args) {
// Task : Functional Programming ile listin cift elemanlarinin  karelerini
// ayni satirda aralarina bosluk bırakarak print ediniz
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3,  15));
        ciftKareyiPrintEt(sayi);
        System.out.println("");
        kuplerinBirFazlasi(sayi);
        System.out.println("");
        ciftKarekokPrint(sayi);
        System.out.println("");
        enBuyukElemanBul(sayi);
        System.out.println("");
        ciftKareMax(sayi);
        System.out.println("");
        elemanTopla(sayi);
        System.out.println("");
        ciftlerinCarpimi(sayi);
    }
    public static void ciftKareyiPrintEt(List<Integer> sayi){
       sayi.stream().filter(Lambda1::ciftBul).map(t-> t*t).forEach(Lambda1::yazdir);

    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini
    // ayni satirda aralarina bosluk birakarak print edin


    public static void kuplerinBirFazlasi( List<Integer> sayi){
        sayi.stream().
                filter(t-> t%2!=1).
                map(t-> (t*t*t)+1).
                forEach(Lambda1::yazdir);

    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
// Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
public static void ciftKarekokPrint( List<Integer> sayi){

        sayi.stream().
                filter(Lambda1::ciftBul).
                map(Math::sqrt).
                forEach((t-> System.out.print(t+" ")));
}

// Task : list'in en buyuk elemanini yazdiriniz

    public static void enBuyukElemanBul(List<Integer> sayi){
        Optional<Integer> maxsayi= sayi.stream().reduce(Math::max);// akisa giren elemanlarin action sonrasi tek eleman haline getirir
        System.out.println(maxsayi);
        System.out.println(sayi.stream().reduce(Math::max));

    }
    /*
 reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
 kullanımı yaygındır pratiktir.
 Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
 bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
 reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
 reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
 İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

 */

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz

  public static void ciftKareMax(List<Integer> sayi)  {
      System.out.println(sayi.stream().filter(Lambda1::ciftBul).map(t-> (t*t)).reduce(Math::max));

  }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...

    public static void elemanTopla(List<Integer> sayi){
        System.out.println(sayi.stream().reduce(0,(a,b)->a+b));
        //yada
        System.out.println(sayi.stream().reduce(Integer::sum));

  }
    /*
    a ilk degerini her zaman atanan degerden alir
    b degerini her zaman stream dan akistan alir
    a ilk degerinden sonraki her degeri action(islem) den alir
     */

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.

    public static void ciftlerinCarpimi(List<Integer> sayi){

        System.out.println(sayi.stream().filter(Lambda1::ciftBul).reduce(Math::multiplyExact));
        System.out.println( sayi.stream().filter(Lambda1::ciftBul).reduce(1,(a,b)-> a*b));
    }

}
