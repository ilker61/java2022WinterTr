package day07_IfElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {
            System.out.println("verilen sayilar esit");
        }

        if (a*b>5){
            System.out.println("sayilarin carpimi 5den buyuk");
        }

        //Bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmez
        //birden fazla bagimsiz if cumlesi oldugunda hepsinin
        //body si calisabilecegi gbi hicbiri de calismayabilir


    }
}