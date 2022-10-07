package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        double x;
        double z = 0;
        int y = 1;

        do {
            System.out.print("Number " + y + ": ");
            x = sc.nextDouble();

            if (x < 0 && y == 1) {
                System.out.println("No number entered.");
                return;
            } else if (x > z) {
                z = x;
            }

            y++;
        } while (1 < x);
        System.out.println("The largest number is " + df.format(z));
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int y = 1;
        System.out.print("n: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Invalid number!");
            return;
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i >= j) {
                    System.out.print(y + " ");
                    y++;
                }
            }
            System.out.println();
        }
    }


    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int x = 6, y = 0;

        for (int i = 1; i <= x; ++i, y = 0) {
            for (int z = 1; z <= x - i; z++) {
                System.out.print("  ");
            }

            while (y != 2 * i - 1) {
                System.out.print("* ");
                y++;
            }

            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here

        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int h = sc.nextInt();
        System.out.print("c: ");
        char c = sc.next().charAt(0);

        for (int i = 0; i < h/2+2; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                char amk = (char) (c - k);
                System.out.print(amk);
            }
            for (int l = 2; l <= i; l++) {
                char amk2 = (char) (c - l);
                System.out.print(amk2);
            }
            System.out.println();
        }

        for (int i = 0; i < h/2+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = h - 1; k >= i; k--) {
                char amk = (char) (c - k);
                System.out.print(amk);
            }
           /* for (int l = 2; l <= i; l++) {
                char amk2 = (char) (c - l);
                System.out.print(amk2);
            } */
            System.out.println();
        }

    }

    //todo Task 5
    public void marks() {
        // input your solution here

    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}