package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    private final String name;

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    private final Calendar birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int)(milliSecondsToYears(today.getTimeInMillis()-birthday.getTimeInMillis()));
    }
    private long milliSecondsToYears(long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
}
