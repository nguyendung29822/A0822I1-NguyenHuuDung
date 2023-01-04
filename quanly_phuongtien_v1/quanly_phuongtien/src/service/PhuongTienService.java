package service;

import model.Oto;
import model.XeMay;
import model.XeTai;

import java.util.ArrayList;

public class PhuongTienService {

    private ArrayList<XeTai> danhSach1;
    private ArrayList<XeMay> danhSach2;
    private ArrayList<Oto> danhSach3;

    public PhuongTienService(ArrayList<XeTai> danhSach1, ArrayList<XeMay> danhSach2, ArrayList<Oto> danhSach3) {
        this.danhSach1 = danhSach1;
        this.danhSach2 = danhSach2;
        this.danhSach3 = danhSach3;
    }

    public PhuongTienService() {

    }

    public void themPhuongTienXeTai(XeTai xeTai) {
        this.danhSach1.add(xeTai);
    }

    public void themPhuongTienXeOto(Oto oto) {
        this.danhSach3.add(oto);
    }

    public void themPhuongTienXeMay(XeMay xeMay) {
        this.danhSach2.add(xeMay);
    }

    public void hienThiDanhSachXeTai() {
        for (XeTai xetai : danhSach1) {
            System.out.println(xetai);
        }
    }

    public void hienThiDanhSachOto() {
        for (Oto oto : danhSach3) {
            System.out.println(oto);
        }
    }

    public void hienThiDanhSachXeMay() {
        for (XeMay xemay : danhSach2) {
            System.out.println(xemay);
        }
    }

//    public boolean kiemTraPhuongTienXeTaiTonTai(XeTai xeTai) {
//        return this.danhSach1.contains(xeTai);
//    }
//    public boolean kiemTraPhuongTienOtoTonTai(Oto oto){
//        return this.danhSach3.contains(oto);
//    }
//    public boolean kiemTraPhuongTienXeMayTonTai(XeMay xeMay){
//        return this.danhSach2.contains(xeMay);
//}

    public boolean xoaPhuongTienXeTai(XeTai xeTai){
        return this.danhSach1.remove(xeTai);
    }
    public boolean xoaPhuongTienOto(Oto oto){
        return this.danhSach3.remove(oto);
    }
    public boolean xoaPhuongTienXeMay(XeMay xeMay){
        return this.danhSach2.remove(xeMay);
    }
    public boolean kiemTraBienKiemSoatXeTai(String bienKiemSoat){
        return this.danhSach1.contains(bienKiemSoat);
    }
    public boolean kiemTraBienKiemSoatOto(String bienKiemSoat1){
        return this.danhSach3.contains(bienKiemSoat1);
    }
    public boolean kiemTraBienKiemSoatXeMay(String bienKiemSoat2){
        return this.danhSach2.contains(bienKiemSoat2);
    }
    public void timKiemXeTai(String bienKiemSoat){
        for (XeTai xetai:danhSach1) {
            if(xetai.getBienKiemSoat().indexOf(bienKiemSoat)>=0){
                System.out.println(xetai);
            }
        }
    }
    public void timKiemOto(String bienKiemSoat1){
        for (Oto oto:danhSach3) {
            if(oto.getBienKiemSoat().indexOf(bienKiemSoat1)>=0){
                System.out.println(oto);
            }
        }
    }
    public void timKiemXeMay(String bienKiemSoat2){
        for (XeMay xemay:danhSach2) {
            if(xemay.getBienKiemSoat().indexOf(bienKiemSoat2)>=0){
                System.out.println(xemay);
            }
        }
    }


}
