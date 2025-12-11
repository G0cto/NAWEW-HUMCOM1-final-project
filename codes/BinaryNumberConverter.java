import java.util.Scanner;

public class BinaryNumberConverter {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number length: ");
        int binaryLength = sc.nextInt();

        int[] binary = new int[binaryLength];

        System.out.println("---Welcome to Number System Conversion---");

        while(true) {
            try {
                System.out.println("Enter Binary Number:");
                for (int i = 0; i < binary.length; i++) {
                    while (true) {
                        System.out.print("Binary digit " + (i+1) + ": ");
                        int binaryIndex = sc.nextInt();
                        if (binaryIndex == 0 || binaryIndex == 1) {
                            binary[i] = binaryIndex;
                            break;
                        } else {
                            System.out.println("Invalid input. Enter 1s o 0s");
                        }
                    }
                }
                System.out.println("Entered binary: ");
                for (int i = 0; i < binary.length; i++) {
                    System.out.print(binary[i] + " ");
                }
                int decimal = 0;
                System.out.println();
                for (int i = 0; i < binary.length; i++) {
                    decimal = decimal * 2 + binary[i];
                }

                while (true) {
                    System.out.println("---Enter Conversion---");
                    System.out.println("1. Binary");
                    System.out.println("2. Decimal");
                    System.out.println("3. Octal");
                    System.out.println("4. Hexadecimal");
                    System.out.println("5. exit");
                    System.out.print("Enter Choice: ");
                    int binaryChoice = sc.nextInt();

                    switch (binaryChoice) {
                        case 1:
                            System.out.println("Binary Number:");
                            for (int i = 0; i < binary.length; i++) {
                                System.out.print(binary[i] + " ");
                            }
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Decimal Number:");
                            System.out.print(decimal + " ");
                            System.out.println();
                            break;
                        case 3:
                            int temp = decimal;
                            int octal = 0;
                            int place = 1;

                            for ( int i = 0; i < binary.length; i++)  {
                                if (temp == 0 ) {
                                    break;
                                }
                                int remainder = temp % 8;
                                octal += remainder * place;
                                place *= 10;
                                temp /=8;
                            }
                            System.out.println("Octal number: ");
                            System.out.println(octal);
                            System.out.println();
                            break;
                        default:
                    }
                }
            } catch (Exception e) {
                System.out.println("Input error");
            }
        }

    }
}
