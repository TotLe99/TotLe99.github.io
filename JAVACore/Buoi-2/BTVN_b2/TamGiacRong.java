package BTVN_b2;
import java.util.Scanner;

public class TamGiacRong {
    public static void main(String[] args) {
		int num, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		num = sc.nextInt();
		System.out.println();
		n = num;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

        for (int i = 2; i <= num; i++){
            for (int j = 1; j < n; j++) {
				System.out.print("* ");
			}
            n--;
            System.out.println();
        }
    }
}
