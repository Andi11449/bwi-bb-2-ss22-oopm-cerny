package testing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Credits: ");
        int credits = sc.nextInt();
        int grade = grade(credits);
        System.out.println("Grade: " + grade);
    }

    public static int grade(int credits) {
        if (credits >= 0 && credits <=49) return 5;
        if (credits >= 50 && credits <=65) return 4;
        if (credits >= 66 && credits <=80) return 3;
        if (credits >= 81 && credits <=95) return 2;
        if (credits >= 96 && credits <=100) return 1;

        throw new IllegalArgumentException("Credits have to be between 0 and 100 but was: " + credits);
    }
}
