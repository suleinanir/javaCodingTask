package week1;

import java.util.Scanner;

public class javaCode1 {
    public class NumberIdentifier {

        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");

            int userInput = scanner.nextInt();

            String result = identify(userInput);

            System.out.println("Result: " + result);

            scanner.close();
        }


        public String identify(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
    }
}
