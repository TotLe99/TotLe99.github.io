import java.util.Scanner;

public class Cau2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        palindrome();
    }

    // Nhập 1 chuỗi bất kỳ và kiểm tra xem chuỗi đó có là chuỗi palindrome (Chuỗi đảo nghịch) không
    public static void palindrome() {
        System.out.print("Nhap: ");
        String str = sc.nextLine();
        char kyTu;

        for (int i = 0; i < str.length(); i++) {
            kyTu = str.charAt((str.length() - i - 1));

            if (str.charAt(i) == kyTu) {
                System.out.println(str + " la chuoi polindrome");
                break;
            } else {
                System.out.println(str + " khong phai chuoi polindrome");
                break;
            }
        }
    }
}
