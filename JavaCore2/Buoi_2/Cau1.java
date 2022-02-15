import java.util.Scanner;

public class Cau1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tinhCanhHuyenTGVuong();
    }

    public static void tinhCanhHuyenTGVuong() {
        System.out.print("Canh a = ");
        double a = sc.nextDouble();
        System.out.print("Canh b = ");
        double b = sc.nextDouble();

        System.out.printf("\tTra ve kieu Pytago");
        double canhHuyen = Math.sqrt((a * a) + (b * b));
        System.out.println("\nCanh huyen = " + canhHuyen);

        System.out.printf("\tTra ve kieu Math");
        System.out.println("\nCanh huyen = " + Math.hypot(a, b));
    }

}