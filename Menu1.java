import java.util.Scanner;

public class Menu1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int choice = 0;

        while (choice != 5) {
            //print the menu
            System.out.println();
            System.out.println("1 - Enter two (2) numbers (x and y)");
            System.out.println("2 - Print all numbers between x and y");
            System.out.println("3 - Find the average of all numbers between x and y");
            System.out.println("4 - Find all prime numbers between x and y");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter x: ");
                x = input.nextInt();
                System.out.print("Enter y: ");
                y = input.nextInt();

                //make sure x is the smaller number
                if (x > y) {
                    int temp = x;
                    x = y;
                    y = temp;
                }
            } else if (choice == 2) {
                for (int i = x; i <= y; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else if (choice == 3) {
                int sum = 0;
                int count = 0;
                for (int i = x; i <= y; i++) {
                    sum = sum + i;
                    count = count + 1;
                }
                double average = (double) sum / count;
                System.out.println("Average = " + average);
            } else if (choice == 4) {
                for (int i = x; i <= y; i++) {
                    if (isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            } else if (choice == 5) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }

    //returns true if n is a prime number
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
