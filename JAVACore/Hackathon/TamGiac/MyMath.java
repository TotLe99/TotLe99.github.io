package TamGiac;
import java.util.Scanner;

public class MyMath{
    public static void main(String[] args) {
        Scanner tg = new Scanner(System.in);
        System.out.println("Nhập a, b, c: ");
        double a, b, c;

        a = tg.nextDouble();
        b = tg.nextDouble();
        c = tg.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Không phải Tam Giác!");
        } else if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Tam Giác nèkk");
        } else {
            System.out.println("Không phải Tam Giác!");
        }
    }
}
