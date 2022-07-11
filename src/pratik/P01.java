package pratik;

public class P01 {
    int number;
    String name;
    static String college="ITS";

    P01(int r, String n, String college){
        this.number=r;
        this.name=n;
        this.college=college;
    }

    public static void main(String[] args) {

        P01 s1=new P01(111, "Karan", "MIT");
        P01 s2=new P01(222, "Aryan", "Harvard");

        System.out.println(s1.number);
        System.out.println(s2.number);

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.college);
        System.out.println(s2.college);

    }

}
