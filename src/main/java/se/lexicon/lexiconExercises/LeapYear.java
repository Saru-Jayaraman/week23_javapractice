package se.lexicon.lexiconExercises;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner getYear = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = getYear.nextInt();
        if(year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
