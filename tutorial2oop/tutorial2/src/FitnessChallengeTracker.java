import java.util.Scanner;
public class FitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSteps = 0;
        int highestSteps = 0;
        for (int day = 1; day <= 7; day++) {
            System.out.print("enter your steps for day" + day + ":::");
            int steps = sc.nextInt();
        totalSteps += steps;

        if (steps > highestSteps) {
            highestSteps = steps;
        }
    }
        double averageSteps = (double) totalSteps / 7;
    System.out.println("\nTotal Steps: "+totalSteps);
        System.out.println("Average Steps: "+averageSteps);
        System.out.println("Highest Steps: "+highestSteps);

        sc.close();
}
}
