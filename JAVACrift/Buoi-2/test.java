import java.util.Scanner;

public class test {
    public static void main(String[] args) {
		int num, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		num = sc.nextInt();
		System.out.println();
		n = num;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if(j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
			}
			System.out.println();
		}

        for (int i = 2; i <= num; i++){
            for (int j = 1; j < n; j++) {
				if(j == 1 || j == n)
                    System.out.print("* ");
                
                else
                    System.out.print(" ");
			}
            n--;
            System.out.println();
        }
    }
}