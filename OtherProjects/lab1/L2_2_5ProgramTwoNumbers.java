//2.2.5
import java.util.Scanner;

public class L2_2_5ProgramTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("Nhap vao gia tri cua x:");
        x = sc.nextDouble();
        System.out.println("Nhap vao gia tri cua y:");
        y = sc.nextDouble();
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));

    }
}
