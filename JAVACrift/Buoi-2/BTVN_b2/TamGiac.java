package BTVN_b2;
import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
		int num, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		num = sc.nextInt();
		System.out.println();
		n = num;
		for (int i = 1; i <= num; i++) {
			for (int j = n - i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
}
}