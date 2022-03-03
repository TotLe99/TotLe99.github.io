public class KiemChungVien extends NhanVien {
    int soLoi;
    static long LUONG_KIEM_CHUNG_VIEN = 9000000;

    public KiemChungVien() {
        super();
    }

    public KiemChungVien(int maNhanVien, String hoTen, int tuoi, int sdt, String email, long luongCB, int soLoi) {
        super(maNhanVien, hoTen, tuoi, sdt, email, luongCB);
        this.soLoi = soLoi;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("\nNhap so loi: ");
        soLoi = scanner.nextInt();
    }

    @Override
    public void tinhLuong() {
        luongNhanVien += LUONG_KIEM_CHUNG_VIEN - soLoi * 50000;
    }

    @Override
    public String toString() {
        return super.toString() + " | So loi: " + soLoi;
    }
}
