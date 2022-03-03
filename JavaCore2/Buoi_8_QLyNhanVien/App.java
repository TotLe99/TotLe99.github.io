import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();

        System.out.println("\nNhap thong tin KIEM CHUNG VIEC");
        nhanVien = new KiemChungVien();
        nhanVien.nhapThongTin();
        arrNhanVien.add(nhanVien);

        System.out.println("\nNhap thong vien LAP TRINH VIEN");
        nhanVien = new LapTrinhVien();
        nhanVien.nhapThongTin();
        arrNhanVien.add(nhanVien);

        System.out.println("----------------------------------------------------------------");
        System.out.println("THONG TIN NHAN VIEN");
        for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
    }
}