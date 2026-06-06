import java.util.Scanner;
import java.time.Year;
public class AgePredeitor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age::");
        int age =sc.nextInt();
        System.out.println("Your age after 10 years: " + (age + 10));
        System.out.println("Your age after 25 years: " + (age + 25));
        System.out.println("Your age after 50 years: " + (age + 50));
        int currentYear=Year.now().getValue();
        int yearTurn100=currentYear+(100-age);
        System.out.println("You will turn 100 in the year: " + yearTurn100);

    }
}
