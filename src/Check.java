import java.util.ArrayList;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;


public class Check {
    static final int YEAR_MY = 2015;

    int years;
    String month;

    Scanner sc = new Scanner(System.in);

    public int validationYears(String s){
        int year = 0;
        if (s.length() == 2){
            s = "20" + s;
            year = Integer.parseInt(s);
        }else if (s.length() == 4) {
            year = Integer.parseInt(s);
        }else year = YEAR_MY;

        return year;
    }

    public int indexMonth(){
        int indexMonth = 0;

        switch (toLowerCase(month)) {
            case "1":indexMonth= 0;
                break;
            case "2":  indexMonth = 1;
                break;
            case "3":  indexMonth = 2;
                break;
            case "4":  indexMonth = 3;
                break;
            case "5":  indexMonth = 4;
                break;
            case "6":  indexMonth = 5;
                break;
            case "7":  indexMonth = 6;
                break;
            case "8":  indexMonth = 7;
                break;
            case "9":  indexMonth = 8;
                break;
            case "10": indexMonth = 9;
                break;
            case "11": indexMonth = 10;
                break;
            case "12": indexMonth = 11;
                break;


            case "january":   indexMonth= 0;
                break;
            case "february":  indexMonth = 1;
                break;
            case "march":  indexMonth = 2;
                break;
            case "april":  indexMonth = 3;
                break;
            case "may":  indexMonth = 4;
                break;
            case "june":  indexMonth = 5;
                break;
            case "july":  indexMonth = 6;
                break;
            case "august":  indexMonth = 7;
                break;
            case "september":  indexMonth = 8;
                break;
            case "october": indexMonth = 9;
                break;
            case "november": indexMonth = 10;
                break;
            case "december": indexMonth = 11;
                break;

            case "jan":   indexMonth= 0;
                break;
            case "feb":  indexMonth = 1;
                break;
            case "mar":  indexMonth = 2;
                break;
            case "apr":  indexMonth = 3;
                break;
            case "jun":  indexMonth = 5;
                break;
            case "jul":  indexMonth = 6;
                break;
            case "aug":  indexMonth = 7;
                break;
            case "sept":  indexMonth = 8;
                break;
            case "oct": indexMonth = 9;
                break;
            case "nov": indexMonth = 10;
                break;
            case "dec": indexMonth = 11;
                break;
            default: indexMonth = -1;
                break;
        }
        return indexMonth;
    }

    public Check() {
        this.years = 2015;
        this.month ="";
    }

    public boolean check() {
        boolean status = true;
        String line = sc.nextLine();
        String mas[] = line.split(" ");
        mas[1].toLowerCase();
        years = validationYears(mas[0]);
        month = mas[1];

        int indexMoth = indexMonth();

        if (indexMoth == -1) System.out.println("not correct");
        else {
            status = false;
            System.out.println("OK");
        }
        return status;
    }
}
