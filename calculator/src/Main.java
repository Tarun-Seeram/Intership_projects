import java.util.Scanner;

public class Main{
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double result;
            System.out.println("Enter '1' for Addition: ");
            System.out.println("Enter '2' for Subtraction: ");
            System.out.println("Enter '3' for Multiplication: ");
            System.out.println("Enter '4' for Division: ");
            System.out.println("Enter '5' for Exit.");
            System.out.print("Enter your operation: ");


            int c = scan.nextInt();


            if (c == 5) {
                System.out.println("Exiting...");
                break;
            }

        System.out.print("Enter the First number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the Second number: ");
        double num2 = scan.nextDouble();



        switch (c) {
            case (1):
                result = Calculator.add(num1, num2);
                System.out.println("Result: " + String.format("%.4f" , result));
                break;
            case (2):
                result = Calculator.sub(num1, num2);
                System.out.println("Result: " + String.format("%.4f" , result));
                break;
            case (3):
                result = Calculator.mul(num1, num2);
                System.out.println("Result: " + String.format("%.4f" , result));
                break;
            case (4):

                try {
                    result = Calculator.div(num1, num2);
                    System.out.println("Result: " + String.format("%.4f" , result));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            default:
                System.out.println("Enter a valid input!");
        }
        }

scan.close();;
    }

}
