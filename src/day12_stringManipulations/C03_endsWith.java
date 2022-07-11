package day12_stringManipulations;

public class C03_endsWith {
    public static void main(String[] args) {
        //Kullanicidan email adresini girmesini iste
        // mail @gmail.com icermiyorsa "lutfen gmail adresi girin"
        // @gmail.com ile bitiyorsa "Email adresiniz kaydoldu" yazdirin
        // @gmail.com  ile bitmiyorsa "lutfen yaziyi kontrol edin" yazdirin

        String mail = "jakyuer@gmail.com";
        String arananKelime = "@gmail.com";

       if (!mail.contains(arananKelime)){
           System.out.println("lutfen gmail adresi girin");
       }else if (mail.endsWith("@gmail.com")){
           System.out.println("Email adresiniz kaydoldu");
       }else {
           System.out.println("lutfen yaziyi kontrol edin");
       }
    }
}
