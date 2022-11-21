package ss4_class_object.thuc_hanh.Quan_Ly_Sach;

public class Sach {
    private String tenSach;
    private double giaBan;
    private int namSuatBan;
    private TacGia tacGia;

    public Sach(String tenSach, double giaBan, int namSuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namSuatBan = namSuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamSuatBan() {
        return namSuatBan;
    }

    public void setNamSuatBan(int namSuatBan) {
        this.namSuatBan = namSuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void inTenSach() {
        System.out.println(this.tenSach);
    }

    public boolean kiemTraCungNam(Sach sachKhac) {
        return this.namSuatBan == sachKhac.namSuatBan;
    }

    public double giaSauKhiGiam(double x) {
        return this.giaBan * (1 - x / 100);
    }
}

