import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class NumberGuesser{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1;
        int answer = 0;

        System.out.println("Welcome to number guessing game!!!");

        while(answer != secretNumber) {
            try{
            System.out.print("Enter a number from 1-100: ");
            answer = scanner.nextInt();

            if (answer < 1 || answer > 100){
                System.out.println("Number out of bound. Enter a number from 1-100\n");
                continue;
            }

            if (answer < secretNumber) {
                System.out.println("Number too low!");
            }
            else if (answer > secretNumber) {
                System.out.println("Number too high!");
            }
            else{
                System.out.println("Answer correct!");
                System.out.println("Thank you for playing NumberGuesser");
            }

            } catch (InputMismatchException e) {
                System.out.println("Enter a number!\n");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}