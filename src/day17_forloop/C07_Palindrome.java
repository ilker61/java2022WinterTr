package day17_forloop;

public class C07_Palindrome {
    public static void main(String[] args) {
        // Soru= (Interview sorusu)
        // Kullanicidan girdigi Stringin palindrom olup olmadigini
        // kontrol eden bir method yaz
        // Palindrom= tersten yazilimi ile ayni olma durumu
        // ornek; madam kelimesinin tersi de madam dir. bu kelime palindromdur

        String input= "kro";


      palindromKontrol(input);

    }

    private static void palindromKontrol(String input) {
        // once input terse cevrilir
        String tersInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.charAt(i);
        }
        System.out.println("Girilen kelimenin tersten yazimi = " +tersInput);

        if (input.equals(tersInput)){
            System.out.println("input palindromdur");
        } else {
            System.out.println("input polindrom degildur");
        }



    }
}
