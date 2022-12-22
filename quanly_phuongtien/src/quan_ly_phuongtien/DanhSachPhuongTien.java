package quan_ly_phuongtien;

import java.util.ArrayList;

public class DanhSachPhuongTien {
    private ArrayList<PhuongTien> xeTai;
    private ArrayList<PhuongTien> xeOto;
    private ArrayList<PhuongTien> xeMay;


//    public DanhSachPhuongTien() {
//        this.xeTai=new ArrayList<PhuongTien>();
//        this.xeOto=new ArrayList<PhuongTien>();
//        this.xeMay=new ArrayList<PhuongTien>();
//    }

    public DanhSachPhuongTien(ArrayList<PhuongTien> xeTai, ArrayList<PhuongTien> xeOto, ArrayList<PhuongTien> xeMay) {
        this.xeTai = xeTai;
        this.xeOto = xeOto;
        this.xeMay = xeMay;
    }

    public DanhSachPhuongTien() {
        this.xeTai = new ArrayList<PhuongTien>();
        this.xeOto = new ArrayList<PhuongTien>();
        this.xeMay = new ArrayList<PhuongTien>();
    }

    public void themPhuongTienXeTai(PhuongTien xeTai) {
        this.xeTai.add(xeTai);
    }

    public void themPhuongTienXeOto(PhuongTien xeOto) {
        this.xeOto.add(xeOto);
    }

    public void themPhuongTienXeMay(PhuongTien xeMay) {
        this.xeMay.add(xeMay);
    }

    public void hienThiPhuongTienXeTai() {
        for (PhuongTien xeTai : xeTai) {
            System.out.println(xeTai);
        }
    }

    public void hienThiPhuongTienXeOto() {
        for (PhuongTien xeOto : xeOto) {
            System.out.println(xeOto);
        }
    }

    public void hienThiPhuongTienXeMay() {
        for (PhuongTien xeMay : xeMay) {
            System.out.println(xeMay);
        }
    }


}
