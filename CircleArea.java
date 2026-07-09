import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter Radius: ");
        radius = input.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
        input.close();
    }
}
