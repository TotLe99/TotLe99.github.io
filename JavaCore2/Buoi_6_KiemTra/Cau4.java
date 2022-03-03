public class Cau4 {
    public static void main(String[] args) {

        int firt10NT = 10;
        int dem = 0;
        int i = 2;

        System.out.println("10 so nguyen to dau tien la:");
        while (dem < firt10NT) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
                dem++;
            }
            i++;
        }

        System.out.println("\nSo nguyen to nho hon 10 la: ");
        for (int j = 2; j < firt10NT; j++) {
            if (isPrimeNumber(j)) {
                System.out.print(" " + j);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
