package day10_switchStatements;

public class C03_Concate {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Candir";

        //Java Candir yazdiralim
        System.out.println(str1+" "+str2); // Java Candir

        String cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle); // Java Candir

        cumle=str1.concat(""+5); //Java5
        System.out.println(cumle);


    }
}
