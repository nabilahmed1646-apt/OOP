import java.util.Scanner;
public class CeltoFer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (9 * celsius / 5) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);
        input.close();
    }
}
