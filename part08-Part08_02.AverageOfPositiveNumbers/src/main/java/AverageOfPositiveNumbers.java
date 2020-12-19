
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int sum = 0;
        int count = 0;

        do {
            input = Integer.parseInt(scanner.nextLine());
            if(input > 0) {
                sum += input;
                count++;
            }
        } while(input != 0);

        if(count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / (double) count);
        }
    }
}
