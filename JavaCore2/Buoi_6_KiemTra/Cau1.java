import java.util.Scanner;

public class Cau1 {
    static Scanner sc = new Scanner(System.in);
    static int hv;
    static int tg;

    public static void main(String[] args) {
        hinhVuong();
        hinhTamGiac();
    }

    public static void hinhVuong() {
        System.out.print("Nhap do dai Hinh Vuong: ");
        hv = sc.nextInt();
        for (int i = 0; i < hv; i++) {
            for (int j = 0; j < hv; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hinhTamGiac() {
        System.out.print("Nhap do dai hinh Tam Giac: ");
        tg = sc.nextInt();
        for (int i = 1; i <= tg; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}