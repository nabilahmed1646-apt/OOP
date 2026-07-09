import java.util.Scanner;
public class AreaofEqT {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        Double side, area;
        System.out.print("Enter side: ");
        side = input.nextDouble();
        area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Areaa = " + area);
        input.close();
    }
}
