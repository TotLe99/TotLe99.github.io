import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        kyTu();

    }

    public static void kyTu() {
        // Ký tự e xuất hiện bao nhiêu lần và có index là bao nhiêu
        String str = "Hello every one";
        char space = ' ';
        int index = 0;
        char kyTu = 'e';
        int dem = 0;

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != space) {
                index++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                dem++;
            }
        }

        System.out.println("So ky tu trong chuoi \"" + str + "\" la: " + index);
        System.out.println("Ky tu \"" + kyTu + "\" trong chuoi \"" + str + "\" xuat hien " + dem + " lan!");
    }

}