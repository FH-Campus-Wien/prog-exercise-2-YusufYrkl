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
        int x = 6;

        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
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

        for (int i = 0; i < h / 2 + 2; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                char amk = (char) (c + 1 - k);
                System.out.print(amk);
            }
            for (int l = 2; l <= i; l++) {
                char amk2 = (char) (c + 1 - l);
                System.out.print(amk2);
            }
            System.out.println();
        }

        for (int i = 0; i < h / 2 + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 1; k++) {
                char amk = (char) (c);
                System.out.print(amk);
            }
         /*   for (int k = h - 1; k >= i; k--) {
                char amk3 = (char) (c - k);
                System.out.print(amk3);
            }
            for (int l = 2; l <= i; l++) {
                char amk2 = (char) (c - l);
                System.out.print(amk2);
            } */
            System.out.println();
        }

    }

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int note;
        int neg = 0;
        double avr = 0;
        int i = 1;

        do {
            System.out.print("Mark " + i + ": ");
            note = sc.nextInt();
            avr = avr + note;

            if (note < 0 || note > 5) {
                System.out.println("Invalid mark!");
                i--;
                avr = avr - note;
            } else if (note == 0) {
                i--;
            } else if (note == 5) {
                neg++;
            } else if (note == 0 && i == 1) {

            }

            i++;
        } while (note > 0);
        i = i - 1;
        avr = avr / i;
        if (Double.isNaN(avr)) {
            avr = 0;
        }
        System.out.printf("Average: %.2f", avr);
        System.out.println();
        System.out.println("Negative marks: " + neg);


    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int num = sc.nextInt();
        while (num > 0) {

            System.out.println(num % 10);

            num = num / 10;

        }
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