package bihomora;

public class Main {

    public static void main(String[] args) {
        isLeapYear(2020);
    }

    public static boolean isLeapYear(int year) {


        if (year < 1 || year > 9999) {
            System.out.println( year + " is not leap year");
            return false;

        }
        else if (year%4 != 0){
            System.out.println( year + " is not leap year");
            return false;

        }
        else if (year%100 != 0){
            System.out.println(year + " is a leap year");
            return true;

        }
        else if (year%400 != 0){
            System.out.println( year + " is not leap year");
            return false;

        }else
        System.out.println(year + " is a leap year");
        return true;

    }
}

