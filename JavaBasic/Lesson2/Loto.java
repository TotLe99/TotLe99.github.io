package Lesson2;

import java.util.Random;
import java.util.Scanner;

public class Loto {

    // config
    static int tiGiaDanhDe = 70;
    static float tiGiaDiem = 24.5f;
    static int tiGiaDanhLo = 80;
    static String username = "LeVanT";
    static float taiKhoan = 1000f;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static int[] giai7 = new int[4];
    static int[] giai6 = new int[3];
    static int[] giai5 = new int[8];
    static int[] giai4 = new int[4];
    static int[] giai3 = new int[6];
    static int[] giai2 = new int[2];
    static int giai1;
    static int giaiDacBiet;
    static boolean result;

    // De
    static int soDe;
    static int soTien;

    // Lo
    static int soLo;
    static int soDiem;
    static int soNhay;

    public static void main(String[] args) {

        System.out.println("Xin chao " + username);
        System.out.println("Tai khoan cua ban la: " + taiKhoan + " VND");

        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println(
                    "Moi ban chon chuc nang\n" + "       1. Danh de\n" + "       2. Danh lo\n" + "       3. Cam so do\n"
                            + "       4. Thoat");

            System.out.print("Nhap: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    danhDe();
                    break;

                case 2:
                    danhLo();
                    break;

                case 3:
                    System.out.println("Cam so do");
                    break;

                case 4:
                    System.out.println("Hen gap ban lan sau!");
                    return;

                default:
                    System.out.println("Ban da nhap sai, moi ban nhap lai!");
                    break;
            }
        }
    }

    public static void danhDe() {
        System.out.println("Moi ban nhap so de: ");
        soDe = scanner.nextInt();

        System.out.println("va so tien");
        soTien = scanner.nextInt();

        System.out.println("Da toi 6h, ket qua la: ");

        randomGiai();
        printGiai();
        checkDe();
        if (result) {
            int soTienThangGiai = soTien * tiGiaDanhDe;
            taiKhoan += soTienThangGiai;

            System.out.println("Ban vua trung!");
            System.out.println("So tien trung la " + soTienThangGiai + " VND");
            System.out.println("So du hien tai la: " + taiKhoan + " VND");
        } else {
            taiKhoan -= soTien;

            System.out.println("Ban vua tach!");
            System.out.println("So du hien tai la: " + taiKhoan + " VND");
        }
    }

    public static void danhLo() {
        System.out.println("Moi ban nhap so lo: ");
        soLo = scanner.nextInt();

        System.out.println("va so diem");
        soDiem = scanner.nextInt();

        System.out.println("Da toi 6h, ket qua la: ");

        randomGiai();
        printGiai();
        checkLo();
        if (soNhay == 0) {
            taiKhoan -= soDiem * tiGiaDiem;

            System.out.println("Ban vua tach!");
            System.out.println("So du hien tai la: " + taiKhoan + " VND");
        } else {
            float soTienThangGiai = soDiem * (tiGiaDanhLo - tiGiaDiem) * soNhay;
            taiKhoan += soTienThangGiai;

            System.out.println("Ban vua trung!");
            System.out.println("So nhay: " + soNhay + " nhay!");
            System.out.println("So tien trung la: " + soTienThangGiai + " VND");
            System.out.println("So du hien tai la: " + taiKhoan + " VND");
        }
    }

    public static void randomGiai() {
        // random giai 7
        for (int i = 0; i < giai7.length; i++) {
            // random tu 0 -> 99
            giai7[i] = random.nextInt(100);
        }

        // random giai 6
        for (int i = 0; i < giai6.length; i++) {
            // random tu 0 -> 999
            giai6[i] = random.nextInt(1000);
        }

        // random giai 5
        for (int i = 0; i < giai5.length; i++) {
            // random tu 0 -> 9999
            giai5[i] = random.nextInt(10000);
        }

        // random giai 4
        for (int i = 0; i < giai4.length; i++) {
            // random tu 0 -> 9999
            giai4[i] = random.nextInt(10000);
        }

        // random giai 3
        for (int i = 0; i < giai3.length; i++) {
            // random tu 0 -> 99999
            giai3[i] = random.nextInt(100000);
        }

        // random giai 2
        for (int i = 0; i < giai2.length; i++) {
            // random tu 0 -> 99999
            giai2[i] = random.nextInt(100000);
        }

        // random giai 1
        giai1 = random.nextInt(100000);

        // random giai dac biet
        giaiDacBiet = random.nextInt(100000);
    }

    public static void printGiai() {
        System.out.println("________________________________________________________________________________________\n");
        // random giai dac biet
        System.out.printf("Giai Dac Biet | %38s \n", String.format("%05d", giaiDacBiet));
        System.out.println("--------------|-------------------------------------------------------------------------");

        // random giai 1
        System.out.printf("Giai 1        | %38s \n", String.format("%05d", giai1));
        System.out.println("--------------|-------------------------------------------------------------------------");

        // random giai 2
        System.out.printf("Giai 2        | %20s %35s \n", String.format("%05d", giai2[0]),
                String.format("%05d", giai2[1]));
        System.out.println("--------------|-------------------------------------------------------------------------");

        // random giai 3
        System.out.printf("Giai 3        | %10s %27s %27s \n", String.format("%05d", giai3[0]),
                String.format("%05d", giai3[1]),
                String.format(
                        "%05d", giai3[2]));

        System.out.printf("              | %10s %27s %27s \n", String.format("%05d", giai3[3]),
                String.format("%05d", giai3[4]),
                String.format("%05d", giai3[5]));
        System.out.println("--------------|-------------------------------------------------------------------------");

        // random giai 4
        System.out.printf("Giai 4        | %10s %19s %19s %19s \n", String.format("%04d", giai4[0]),
                String.format("%04d", giai4[1]),
                String.format("%04d", giai4[2]), String.format("%04d", giai4[3]));
        System.out.println("--------------|-------------------------------------------------------------------------");

        // random giai 5
        System.out.printf("Giai 5        | %10s %27s %27s \n", String.format("%04d", giai5[0]),
                String.format("%04d", giai5[1]),
                String.format(
                        "%04d", giai5[2]));

        System.out.printf("              | %10s %27s %27s \n", String.format("%04d", giai5[3]),
                String.format("%04d", giai5[4]),
                String.format("%04d", giai5[5]));
        System.out.println("--------------|-------------------------------------------------------------------------");

        // random giai 6
        System.out.printf("Giai 6        | %10s %27s %27s \n", String.format("%03d", giai6[0]),
                String.format("%03d", giai6[1]),
                String.format("%03d", giai6[2]));
        System.out.println("--------------|-------------------------------------------------------------------------");

        // random giai 7
        System.out.printf("Giai 7        | %10s %19s %19s %19s \n", String.format("%02d", giai7[0]),
                String.format("%02d", giai7[1]),
                String.format("%02d", giai7[2]), String.format("%02d", giai7[3]));
        System.out
                .println("________________________________________________________________________________________ \n");
    }

    public static void checkDe() {
        // Tach 2 so giai dac biet
        int haiSoCuoi = giaiDacBiet % 100;

        // check giai dac biet
        if (soDe == haiSoCuoi) {
            result = true;
        } else {
            result = false;
        }
    }

    public static void checkLo() {
        soNhay = 0;

        // check giai 7
        for (int i : giai7) {
            if (soLo == i) {
                soNhay++;
            }
        }

        // check giai 6
        for (int i : giai6) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }

        // check giai 5
        for (int i : giai5) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }

        // check giai 4
        for (int i : giai4) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }

        // check giai 3
        for (int i : giai3) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }

        // check giai 2
        for (int i : giai2) {
            int haiSoCuoi = i % 100;
            if (soLo == haiSoCuoi) {
                soNhay++;
            }
        }

        // check giai 1
        int haiSoCuoiGiai1 = giai1 % 100;
        if (soLo == haiSoCuoiGiai1) {
            soNhay++;
        }

        // check giai dac biet
        int haiSoCuoiDacBiet = giaiDacBiet % 100;
        if (soLo == haiSoCuoiDacBiet) {
            soNhay++;
        }
    }
}
