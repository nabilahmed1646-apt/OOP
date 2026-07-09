import java.util.Scanner;
public class AreaofT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        double s, area;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("area = " + area);
        input.close();

    }
}
