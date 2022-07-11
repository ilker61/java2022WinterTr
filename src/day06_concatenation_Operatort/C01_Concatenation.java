package day06_concatenation_Operatort;

public class C01_Concatenation {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //Veriablelerin degerlerini degistirmeden
        // asagidaki ifadeleri bu veriablelerle yazder
        //Java5Guzel

        System.out.println(str1+sayi1+str2); //Java5Guzel

        // 2Guzel15

        System.out.println((sayi1-sayi2)+str2+(sayi1*3));  //2Guzel15

        //Java22

        System.out.println(str1+(sayi1-sayi2) +(sayi1-sayi2) ); // Java22

       //53Guzel
        System.out.println(""+sayi1+sayi2+str2); //53Guzel

        //Eger tamamen sayilardan olusan bir String varsa ve biz bunu
        // Int e cevirmek istiyorsak Integer.valueOf(String) methodunu kullaniriz
        //Bir sayiyi stringe cevirmak icin sayiyi "" (hiclik ile toplariz ama hiclik basta olacak
        System.out.println("#########");
        String str3= "4527";
        int sayi3=Integer.valueOf(str3);
        System.out.println(sayi3);








    }
}
