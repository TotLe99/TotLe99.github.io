import java.util.Random;

public class Cau3 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);

        if (isPrimeNumber(a)) {
            System.out.println("Random ra so nguyen to = " + a);
        } else {
            System.out.println("Random ko ra nguyen to!");
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
