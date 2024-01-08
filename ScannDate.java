package scanDate;

import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class ScannDate {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Date currentDate = new Date(); // we have created an object
        System.out.println("enter your birth year");
        int birthYear = myScanner.nextInt();
        System.out.println("enter your birth month");

        int birthMonth = myScanner.nextInt();
        System.out.println("enter your birth day");

        int birthDay = myScanner.nextInt();

        Calendar userbirthday = Calendar.getInstance();
        Calendar currentday = Calendar.getInstance();
        userbirthday.set(birthYear, birthMonth - 1, birthDay);
        int theage = currentday.get(Calendar.YEAR) - userbirthday.get(Calendar.YEAR);
        if (currentday.get(Calendar.DAY_OF_YEAR) < userbirthday.get(Calendar.DAY_OF_YEAR)) {
            theage--;
        }
        System.out.println("you are " + theage + " old");

        myScanner.close();
    }
}
