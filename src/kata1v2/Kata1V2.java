package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1V2 {

    public static void main(String[] args) {
    Calendar date;
    date = GregorianCalendar.getInstance();
    date.set(1992,8,17);
    
    Person miPerson = new Person("Aresti",date);
        System.out.println(miPerson.getName() + " tiene " + miPerson.getAge() + " años");
    }
}
