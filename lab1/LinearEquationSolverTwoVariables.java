//2.2.6 - Part 2
import java.util.Scanner;

public class LinearEquationSolverTwoVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số của hệ phương trình
        System.out.println("Nhập hệ số của hệ phương trình:");
        System.out.print("Nhập a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập c1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Nhập a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Nhập c2: ");
        double c2 = scanner.nextDouble();

        // Tính định thức
        double D = a1 * b2 - b1 * a2;
        double Dx = c1 * b2 - b1 * c2;
        double Dy = a1 * c2 - c1 * a2;

        // Kiểm tra nghiệm
        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("Hệ phương trình có nghiệm duy nhất: x = %.2f, y = %.2f%n", x, y);
        } else {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }

    }
}
