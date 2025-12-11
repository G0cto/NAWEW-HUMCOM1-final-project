import java.util.Scanner;

public class seatReservation {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int rows = 5;
        int columns = 6;

        char[][] seats = new char[rows][columns];

        while (true) {
            try {
                System.out.println("\n---Seat Reservation---");
                System.out.println("1. Show seats");
                System.out.println("2. Reserve seat");
                System.out.println("3. Exit");

                int choice;

                    System.out.print("Enter choice: ");
                    choice = sc.nextInt();

                switch (choice) {
                    case 1: //print the table
                        System.out.print("    ");
                        for (int i = 0; i < 6; i++) {
                            System.out.print("c" + (i+1) + " ");
                        }
                        System.out.println();
                        for (int i = 0; i < 5; i++) {
                            System.out.print("r" + (i+1) + "  ");
                            for (int j = 0; j < 6; j++) {
                                System.out.print(seats[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2: // reserving seat
                        System.out.print("Enter row: ");
                        int rowChoice = sc.nextInt()-1;
                        System.out.print("Enter column: ");
                        int columnChoice = sc.nextInt()-1;

                        if ( rowChoice < 0 || rowChoice >= rows || columnChoice < 0 || columnChoice >= columns) {
                            System.out.print("Seat not found");
                        } else if (seats[rowChoice][columnChoice] == 'X' ){
                            System.out.print("Seat is already reserved");
                        } else {
                            seats[rowChoice][columnChoice] = 'X';
                            System.out.print("Seat reserved!");
                        }
                        break;
                    case 3:
                        System.out.println("Program terminated");
                    default:
                        System.out.println("Invalid Choice");

                }

            } catch (Exception e) {
                System.out.println("Input error");
                sc.nextLine();
            }
        }
    }


}
