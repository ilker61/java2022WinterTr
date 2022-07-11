package day20_scope_Arrays;

public class C01_Scope {

    int sayi;
    String bransIsm="Java";
    boolean okuldaMi;

    public static void main(String[] args) {
        // sayi=10; sayi veriablesi static olmadigindan main methodda kullanilamaz
        // instanvce veriablelere static methodtan ulasabilmek icin obje olusturmak lazimdir
        C01_Scope obj1= new C01_Scope();

        System.out.println(obj1.sayi);// 0 yazdirir. class levelde olustu. default degeri 0 dir
        obj1.sayi=10;
        System.out.println(obj1.sayi);// 10 basar.
        obj1.bransIsm="SQL";
        System.out.println(obj1.okuldaMi);// falce

        C01_Scope obj2=new C01_Scope();

        System.out.println(obj2.sayi);// yine 0 basar. cunku obj2
        System.out.println(obj2.bransIsm);// Java basar.

        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);// falce



    }


}
