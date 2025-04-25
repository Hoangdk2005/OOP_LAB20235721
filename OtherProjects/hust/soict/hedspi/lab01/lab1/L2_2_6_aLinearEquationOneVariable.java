//2.2.6 - Part 1
import java.util.Scanner;
public class L2_2_6_aLinearEquationOneVariable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Nhập hệ số a và b từ người dùng
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        // Kiểm tra xem a có phải là 0 hay không
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Tính nghiệm x
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }
}
