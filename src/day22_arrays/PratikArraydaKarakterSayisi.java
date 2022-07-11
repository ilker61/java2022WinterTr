package day22_arrays;

public class PratikArraydaKarakterSayisi {
    public static void main(String[] args) {
        // Verilen bir cumlede istenen harfin kac defa
        // kullanildigini yazdiran method yaz

        String cumle="Nerede o hello word yazdiramayan ogrenciler?";
        String harf="o";

        tekrarliHarfBulma(cumle, harf);

    }

    private static void tekrarliHarfBulma(String cumle, String harf) {

        String cumleArr[]=cumle.replace(" ", "").split("");
        int sayac=0;

        for (int i = 0; i < cumleArr.length; i++) {
            if (cumleArr[i].equals(harf)) {
                sayac++;
            }
        }
        System.out.println("Cumlede "+sayac+ " tane "+ "'"+harf+"'" + " harfi vardir");

    }
}
