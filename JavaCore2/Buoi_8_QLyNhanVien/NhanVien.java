import java.util.Scanner;

public abstract class NhanVien {

    int maNhanVien;
    String hoTen;
    int tuoi;
    int sdt;
    String email;
    long luongNhanVien;
    static Scanner scanner = new Scanner(System.in);

    public NhanVien(int maNhanVien, String hoTen, int tuoi, int sdt, String email, long luongNhanVien) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;
        this.luongNhanVien = luongNhanVien;
    }

    public NhanVien() {
        super();
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getLuongCB() {
        return luongNhanVien;
    }

    public void setLuongCB(long luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }

    public void nhapThongTin() {
        System.out.print("Nhap ma: ");
        maNhanVien = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = scanner.nextInt();
        System.out.print("Nhap so dien thoai: ");
        sdt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
    }

    public abstract void tinhLuong();

    @Override
    public String toString() {
        return maNhanVien + " | Ho va ten: " + hoTen + " | Tuoi: " + tuoi + " | SDT: " + sdt + " | Email:" + email
                + " | Luong = " + luongNhanVien + " VND";
    }

}
