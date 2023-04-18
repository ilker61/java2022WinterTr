package day10_switchStatements;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        int a=5, b=10;
        char operator='*';

        switch (operator){
            case '*':
                System.out.println("Carpma operatorinin sonucu: " + (a*b));
                break;
            case '+':
                System.out.println("Toplama operatorinin sonucu: " + (a+b));
                break;
            case '-':
                System.out.println("Cikarma operatorinin sonucu: " + (a-b));
                break;
            case '/':
                System.out.println("Bolme operatorinin sonucu: " + (a/b));
                break;
            case '%':
                System.out.println("Mod: "+(a%b));
                break;
            default:
                System.out.println("Litfin digir bir islim girin");
        }







    }
}
