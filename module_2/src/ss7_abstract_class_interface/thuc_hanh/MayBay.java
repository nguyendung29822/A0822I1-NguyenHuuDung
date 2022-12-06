package ss7_abstract_class_interface.thuc_hanh;

public class MayBay extends PhuongTienDiChuyen {
    protected String loaiNhienLieu;

    public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 200;
    }

    public void catCanh() {
        System.out.println("cất cánh");
    }

    public void haCanh() {
        System.out.println("hạ cánh");
    }
}
