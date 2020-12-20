
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch(command) {
                case "add":
                    if(first + amount <= 100 && amount >= 0) {
                        first += amount;
                    }
                    else {
                        first = 100;
                    }
                    break;
                case "move":
                    //if amount is greater than amount in first container
                    // move all of first container liquid to second
                    if(amount >= 0) {
                        if(amount > first) {
                            if(second + first <= 100) {
                                second += first;
                            }
                            else {
                                second = 100;
                            }
                            first = 0;
                        }
                        else if(second + amount <= 100 && first - amount >= 0) {
                            first -= amount;
                            second += amount;
                        }
                        else {
                            first = 0;
                            second = 100;
                        }
                    }
                    break;
                case "remove":
                    if(amount >= 0) {
                        if(amount > second) {
                            second = 0;
                        }
                        else {
                            second -= amount;
                        }
                    }
                    break;
            }
        }
    }

}
