package Exercise07;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise07 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String length = scanner.nextLine();

        System.out.print("What is the width of the room in feet? ");
        String width = scanner.nextLine();

        int len = Integer.parseInt(length);
        int wid = Integer.parseInt(width);

        System.out.println("You entered dimensions of " + len + " feet by " + wid + " feet.");

        double SqFeet = (len*wid);
        double meters = (SqFeet/10.764);

        System.out.println("The area is ");
        System.out.println(SqFeet + " square feet");
        System.out.print(String.format("%.3f", meters) + " square meters");

    }

}
