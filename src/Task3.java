import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthYear = InputHelper.getRangedInt(scan, "Enter in your birth year :", 1950, 2010);
        int birthMonth = InputHelper.getRangedInt(scan, "Enter in your birth month :", 1, 12);
        int birthDay;
        int birthHour;
        int birthMinute;

        if (birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11) {
            birthDay = InputHelper.getRangedInt(scan, "Enter in your birth day :", 1, 30);
        } else if (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12) {
            birthDay = InputHelper.getRangedInt(scan, "Enter in your birth day :", 1, 31);
        } else {
            birthDay = InputHelper.getRangedInt(scan, "Enter in your birth day :", 1, 29);
        }

        birthHour = InputHelper.getRangedInt(scan, "Enter in your birth hour :", 1, 24);
        birthMinute = InputHelper.getRangedInt(scan, "Enter in your birth minute :", 1, 59);

        System.out.println("Year: " + birthYear);
        System.out.println("Month: " + birthMonth);
        System.out.println("Day: " + birthDay);
        System.out.println("Hour: " + birthHour);
        System.out.println("Minute: " + birthMinute);
    }
}