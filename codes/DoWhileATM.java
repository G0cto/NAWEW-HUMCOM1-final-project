import java.util.Scanner;

public class DoWhileATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        double newAmount;
        int choice;

        System.out.println("Hi, Welcome to ATM");

        try{
            do{
                System.out.println("\n1. Check balance\n2. Deposit\n3. Withdraw\n4. Exit");
                System.out.println("Please enter operation: ");
                choice = sc.nextInt();

                if (choice==1) {
                    System.out.print("balance: " + balance);
                } else if (choice==2) {
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = sc.nextDouble();
                    if (depositAmt < 50) {
                        System.out.print("Insufficient amount\nP50 is required minimum");
                    } else {
                        newAmount = balance + depositAmt;
                        System.out.print("Deposit successful\nbalance: " + newAmount);
                    }
                } else if (choice==3) {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmt = sc.nextDouble();
                    if (withdrawAmt > balance) {
                        System.out.print("Insufficient funds");
                    } else {
                        newAmount = balance - withdrawAmt;
                        System.out.print("Withdrawal successful\nbalance: " + newAmount);
                    }
                } else {
                    System.out.print("thank you for your transaction");
                }
            } while( choice != 4);
        } catch(Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
