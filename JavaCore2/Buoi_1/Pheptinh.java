package Buoi_1;

public class Pheptinh {

    static float a = 5f;
    static float b = 8f;

    public static void main(String[] args) {
        float Cong = a + b;
        System.out.println("Phep cong: " + Cong);

        float Tru = a - b;
        System.out.println("Phep tru: " + Tru);

        float Nhan = a * b;
        System.out.println("Phep nhan: " + Nhan);

        float Chia = a / b;
        System.out.println("Phep chia: " + Chia);

        float luyThua = (float) Math.pow(a,b);
        System.out.println("Phep luy thua: " + luyThua);
    }

}