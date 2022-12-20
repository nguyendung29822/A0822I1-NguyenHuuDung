package quan_ly_phuongtien;

import java.util.ArrayList;

public class DanhSachPhuongTien {
    private ArrayList<PhuongTien> phuongTien;

    public DanhSachPhuongTien() {
        this.phuongTien = new ArrayList<PhuongTien>();
    }

    public DanhSachPhuongTien(ArrayList<PhuongTien> phuongTien) {
        this.phuongTien = phuongTien;
    }

    public void themPhuongTien(PhuongTien phuongTien){
        this.phuongTien.add(phuongTien);
    }


}
