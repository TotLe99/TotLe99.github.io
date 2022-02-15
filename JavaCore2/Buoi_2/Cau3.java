import java.util.Random;
import java.util.Scanner;

public class Cau3 {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhap so: ");
        int number = sc.nextInt();
        int soNgauNhien = random.nextInt(50);
        System.out.println("So ngau nhien: " + soNgauNhien);

        String result = number == soNgauNhien ? "Hai so bang nhau!" : "Hai so khac nhau!";
        System.out.println(result);

    }

}
