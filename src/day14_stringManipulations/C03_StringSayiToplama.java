package day14_stringManipulations;

public class C03_StringSayiToplama {
    public static void main(String[] args) {
        // soru; String seklinde verilen asagidaki fiyatlarin toplamini bulun
        // String str1= "$13.99";
        // String str2= "$10.55";
        // ipucu= Double.parseDouble methodunu kullanabilirsiniz

        String str1= "$13.99";
        String str2= "$10.55";


        str1=str1.replaceAll("\\D", "");
        str2=str2.replaceAll("\\D", "");
        double toplam=0;
        toplam=Double.parseDouble(str1) + Double.parseDouble(str2);
        System.out.println("$" + toplam/100);

    }
}
