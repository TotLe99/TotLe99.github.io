import java.util.Scanner;

public class Cau1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Cau1 ChuanHoa = new Cau1();
        ChuanHoa.chuanHoaTen();
    }

    public void chuanHoaTen() {
        System.out.print("Ho va ten: ");
        String fullName = sc.nextLine();
        String[] temp = fullName.split(" ");
        String name = "";
        for (int i = 0; i < temp.length; i++) {
            name += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
            if (i < temp.length - 1);
                name += " ";
        }
        System.out.println("Sau khi chuan hoa: " + name);
        sc.close();
    }
}
