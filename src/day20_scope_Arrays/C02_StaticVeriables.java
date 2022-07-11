package day20_scope_Arrays;

public class C02_StaticVeriables {

    // instance veriableler objeye baglidir ve her objede farkli deger alabilir
    // static veriableler ise class veriable olarak tanimlanir ve tum class uyeleri icin aynidir
    // eger static veriableniinndegeri degistirilirse herkes icin degisir

    static String okulIsmi="Yildiz Koleji";
    static int okulNO;
    static boolean okulAcikMi;


    public static void main(String[] args) {
        System.out.println(okulIsmi);// "YildizKoleji"
        okulNO=102;
        System.out.println(okulNO);// 102
        System.out.println(okulAcikMi);// falce

        staticMethod();

        System.out.println(okulNO);
    }

    public static void staticMethod(){
        okulNO=200;
        System.out.println(okulNO);// 200
    }
}
