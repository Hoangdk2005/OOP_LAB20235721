import java.util.Scanner;

public class Lab1_2_2_5 {
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
