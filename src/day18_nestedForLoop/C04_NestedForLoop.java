package day18_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

        seklini icra eyleyelim

         */

        int input=6;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = input-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
