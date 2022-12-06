package ss7_abstract_class_interface.thuc_hanh;

public class XeDap extends PhuongTienDiChuyen{
    public XeDap(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 50;
    }
}
