package pratik;

import java.time.LocalDate;
import java.time.Period;

public class Date {
    public static void main(String[] args) {
        LocalDate trh= LocalDate.now();
        System.out.println(trh);
        System.out.println(trh.getMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.plusYears(3));


        LocalDate dogumTarihi= LocalDate.of(1977,11,10);
        System.out.println(Period.between(dogumTarihi,trh)); // P44Y4M27D

    }

}
