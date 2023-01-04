package ss17_quanly_sanpham_luura_file_nhiphan;

import java.util.ArrayList;

public class DanhSachSanPham {
private ArrayList<SanPham> danhSach;

    public DanhSachSanPham(ArrayList<SanPham> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSanPham() {
        this.danhSach = new ArrayList<SanPham>();
    }
    public void themSanPham(SanPham sanPham){
        this.danhSach.add(sanPham);
    }
    public void hienThiDanhSachSanPham(){
        for (SanPham sanpham:danhSach) {
            System.out.println(sanpham);
        }
    }
    public void timKiemSanPham(String maID){
        for (SanPham sanpham:danhSach) {
            if(sanpham.getMaSanPham().indexOf(maID)>=0){
                System.out.println(sanpham);
            }
        }
    }

}
