import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int num = sc.nextInt();
        int n;
        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++) {
            n = num%i;
            if(n == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " Là số nguyên tố! ");
        } else {
            System.out.println(num + " Không phải là số nguyên tố!");
        }
        sc.close();
    }
}