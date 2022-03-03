public class Cau2 {
    public static void main(String[] args) {
        soKyTu();
    }

    // Đếm và in ra index của các ký tự o
    public static void soKyTu() {
        String str = "You only live once, but if you do it right, once is enough";
        int index = 0;
        int demO = 0;
        char kyTu = 'o';
        char space = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                demO++;
            }
        }

        for (int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) != space) {
                index++;
            }
        }
        System.out.println("\nKy tu \"" + kyTu + "\" trong \"" + str + "\" = " + demO);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("So ky tu chuoi \"" + str + "\" = " + index);
    }
}
