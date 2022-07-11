package pratik;

public class PalindromKontrol {
    public static void main(String[] args) {
        // Soru= (Interview sorusu)
        // Kullanicidan girdigi Stringin palindrom olup olmadigini
        // kontrol eden bir method yaz
        // Palindrom= tersten yazilimi ile ayni olma durumu
        // ornek; madam kelimesinin tersi de madam dir. bu kelime palindromdur

        String input="farafa";
        palindromKontrolEt(input);

    }

    private static void palindromKontrolEt(String input) {

        String tersInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.charAt(i);
        }

        if (input.equals(tersInput)){
            System.out.println("input Palindromdur");
        } else {
            System.out.println("input PALINDROM DEGILDUR");
        }

    }
}
