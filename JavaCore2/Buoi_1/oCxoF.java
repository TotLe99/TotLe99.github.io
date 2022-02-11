package Buoi_1;

public class oCxoF {
    public static void main(String[] args) {
        float c = 14f;
        float f = 57.2f;

        // chuyen do C sang do F
        float CtoF = c * 9 / 5 + 32;
        System.out.println(CtoF + " do F");

        // chuyen do F sang do C
        float FtoC = (f - 32) * 5 / 9;
        System.out.println(FtoC + " do C");
    }
}
