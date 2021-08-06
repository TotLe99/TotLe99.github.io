import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int num = scan.nextInt();
    while (true) {
        if (scan.equals("exit")) {
        break;
      int temp;
        boolean isPrime=true;
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
      
    }
}
}
}