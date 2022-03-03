import java.util.Scanner;

public class Cau5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        multiArray();
    }

    public static void multiArray() {
        System.out.print("Nhap so dong: ");
        int soDong = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int soCot = sc.nextInt();
        int[][] Arr = new int[soDong][soCot];

        System.out.println("-------------------------------- ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
                Arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("-------------------------------- ");
        System.out.println("In mang: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("-------------------------------- ");
        System.out.println("Duong cheo chinh:");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                if (i == j) {
                    System.out.print(Arr[i][j] + "\t");
                }

            }
        }

    }
}
