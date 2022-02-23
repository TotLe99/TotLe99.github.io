import java.util.Scanner;

public class Cau2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Cau2 ChangeArray = new Cau2();
        ChangeArray.changeArray();
    }

    public void changeArray(){
        int[] n = new int[6];
        
        for (int i = 1; i < n.length; i++){
            System.out.print("Nhap phan tu thu " + i + ": ");
            n[i] = sc.nextInt();
        }

        System.out.println("\nCac phan tu: ");
        for (int i = 1; i < n.length; i++) {
            System.out.print(n[i] + "\t");
        }

        System.out.println("\n-----------------------------------");
        System.out.println("So chan trong mang +1:");
        for (int i = 1; i < n.length; i++) {
            if (n[i] % 2 == 0)
                n[i] += 1;
            System.out.print(n[i] + "\t");
        }

        sc.close();
    }
}
