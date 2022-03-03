
public class LapTrinhVien extends NhanVien {
    double overTime;
    static long LUONG_LAP_TRINH_VIEN = 8000000;

    public LapTrinhVien() {
        super();
    }

    public LapTrinhVien(int maNhanVien, String hoTen, int tuoi, int sdt, String email, long luongCB, double overTime) {
        super(maNhanVien, hoTen, tuoi, sdt, email, luongCB);
        this.overTime = overTime;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("\nNhap gio lam them: ");
        overTime = scanner.nextDouble();
    }

    @Override
    public void tinhLuong() {
        luongNhanVien += (long) (LUONG_LAP_TRINH_VIEN + overTime * 200000);
    }

    @Override
    public String toString() {
        return super.toString() + " | Gio lam them: " + overTime;
    }

}
