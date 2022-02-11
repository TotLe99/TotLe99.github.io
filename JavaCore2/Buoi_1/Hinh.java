package Buoi_1;

public class Hinh {
    // static double Pi = 3.14;
    public static void main(String[] args) {
        // hinhChuNhat
        hinhChuNhat(4, 9);

        // hinh Tron
        hinhTron(15);

        //hin tam giac
        hinhTamGiac(10, 12);
    }

    public static void hinhChuNhat(double rong, double dai) {
        double dienTichHcn = rong * dai;
        System.out.println("Dien tich HCN: " + dienTichHcn);

        double chuViHcn = (rong + dai) * 2;
        System.out.println("Chu vi HCN: " + chuViHcn);
        System.out.println("----------------------------");
    }

    public static void hinhTron(double banKinh) {
        double dienTichTron = Math.pow(banKinh, 2) * Math.PI;
        System.out.println("Dien tich hinh Tron: " + dienTichTron);

        double chuViTron = 2 * banKinh * Math.PI;
        System.out.println("Chu vi hinh Tron: " + chuViTron);
        System.out.println("----------------------------");
    }

    public static void hinhTamGiac(double day, double cao) {
        double dienTichTG = (day * cao) / 2;
        System.out.println("Dien tich Tam Giac: " + dienTichTG);
    }
}
