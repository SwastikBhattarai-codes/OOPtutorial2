import java.util.Scanner;

public class Resultcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        double marks = sc.nextDouble();

        String grade =
                (marks >= 90 && marks <= 100) ? "A+" :
                        (marks >= 80) ? "A" :
                        (marks >= 76) ? "A-" :
                        (marks >= 72) ? "B+" :
                        (marks >= 68) ? "B" :
                        (marks >= 65) ? "B-" :
                        (marks >= 60) ? "C+" :
                        (marks >= 56) ? "C" :
                        (marks >= 50) ? "C-" :
                        (marks >= 40) ? "D+" :
                        (marks >= 0) ? "F" :
                        "Invalid Marks";

        System.out.println("Grade  = " + grade);

        sc.close();
    }
}