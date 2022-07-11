package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //soru; Kullanicidan pozitif bir rakam girmesini iste.
        // girilen rakama gore asagidaki sekli cizdir
        //*
        //**
        //***
        //****
        int input=5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // NESTED FORLOOP ya dikdortgen yada kare olmak durumundadir
        // dikdortgen istendiginde bagimsiz end point belirleriz
        // ucgen istendiginde ise inner forloop ta end point outer loop i'si end point olarak belirlenir

    }
}
