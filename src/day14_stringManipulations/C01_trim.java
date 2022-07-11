package day14_stringManipulations;

public class C01_trim {
    public static void main(String[] args) {
        String str="  siz ne derseniy deyin java bildigini okur  ";
        System.out.println(str.length()); // 45
        str=str.trim();
        System.out.println(str.length()); // 41
    }
}
