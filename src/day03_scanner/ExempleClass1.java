package day03_scanner;

public class ExempleClass1 {


    public static void main(String[] args) {
        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        String ulkeIsmi="Yunanistan";
        System.out.println(ulkeIsmi);

        char sembol;
        sembol='Y';
        System.out.println(sembol);

        int sayi1=20, sayi2=29;
        System.out.println("sayi1 + sayi2 = "+ (sayi1+sayi2));

        //  2- isim ve soyisim icin iki variable olusturun ve bunlari
        //  isminiz : Mehmet
        //  soyisminiz : Bulutluoz
        //  seklinde yazdirin

        String isim= "Mehmet";
        String soyIsim="Bulutluoz";

        System.out.println("Verdiginiz bilgiler asagidaki gibidir" + "\nisim: "+ isim + "\nsoyisim: "+ soyIsim);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int sayi3=20;
        double sayi4=9.8;
        System.out.println("sayi3 + sayi4= " + (sayi3+sayi4));

        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        //5 – char data turunde bir variable olusturun ve yazdirin

        char isaret;
        isaret='*';
        System.out.println(isaret);

        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi5= 11;
        char degisken;
        degisken='N';
        int sayi6= 'N';
        System.out.println(sayi6);
        System.out.println(sayi5+degisken);




    }
}
