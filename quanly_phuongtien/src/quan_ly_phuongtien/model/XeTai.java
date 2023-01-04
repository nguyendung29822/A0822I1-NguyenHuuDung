package quan_ly_phuongtien.model;

public class XeTai extends PhuongTien {
    private double trongTai;


    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai(String bKS, HangSanXuat tenHangSanXuat1, int namHangSanXuat, String bienKiemSoatXeTai, Double trongTai) {
    }

//    public XeTai(String bKS, HangSanXuat tenHangSanXuat1, int namHangSanXuat, String chuSoHuu, Double trongTai) {
//    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai[" + super.toString() +
                "trongTai=" + trongTai +
                "] ";
    }
}
