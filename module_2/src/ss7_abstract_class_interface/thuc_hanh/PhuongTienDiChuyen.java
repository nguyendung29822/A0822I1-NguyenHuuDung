package ss7_abstract_class_interface.thuc_hanh;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();

    }
    public void batDau(){
        System.out.println("bắt đầu.... ");
    }
    public void tangToc(){
        System.out.println("tăng tốc....");
    }
    public void dungLai(){
        System.out.println("dùng lại....");
    }
    public abstract double layVanToc();
}
