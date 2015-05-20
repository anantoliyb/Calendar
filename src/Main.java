import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Check check = new Check();

        boolean status = true;
        while (status){
            status = check.check();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(check.years,check.indexMonth(), 1);

        Calendar c1 = Calendar.getInstance();
        c1.set(check.years,check.indexMonth(),1);

        Calendar c2 = Calendar.getInstance();
        c2.set(check.years,check.indexMonth()+1,1);

        int mothSiza =0;

        for (int i = 0; i < 32; i++) {
            c1.add(Calendar.DAY_OF_WEEK,1);
            mothSiza++;

            if(c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)) break;
        }

        int dayNumber = (calendar.get(Calendar.DAY_OF_YEAR)+2)%7;

        System.out.println(dayNumber);
        System.out.println(mothSiza);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + " " + calendar.get(Calendar.MONTH)
        + " " + calendar.get(Calendar.YEAR));

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        Test test = new Test(dayNumber,mothSiza);

        System.out.println();
    }
}
