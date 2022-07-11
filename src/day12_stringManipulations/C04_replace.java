package day12_stringManipulations;

public class C04_replace {
    public static void main(String[] args) {
        String str= "Bugun ne cok sey ogrendik";

        //Bu cumlede bosluk disindaki karakter sayisini bulun

        System.out.println(str.replace(" ", "").length());// 21 sadece bu satir icin. orj str degismez

        // Atama yapilmadigi surece orjinal String kalici olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur
        System.out.println(str.length()); // 25 orjinal str lenght

        // str da kalici degisiklik yapalim
        // bugun yerine yarin
        // ogrendik yerine ogrenecegiz atayalim

        str=str.replace("Bugun", "Yarin").replace("ogrendik", "ogrenecegiz");
        System.out.println(str);

    }
}
