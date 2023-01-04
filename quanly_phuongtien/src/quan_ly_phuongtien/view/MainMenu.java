package quan_ly_phuongtien.view;

import quan_ly_phuongtien.DanhSachPhuongTien;
import quan_ly_phuongtien.model.HangSanXuat;
import quan_ly_phuongtien.model.Oto;
import quan_ly_phuongtien.model.XeMay;
import quan_ly_phuongtien.model.XeTai;
import quan_ly_phuongtien.service.*;
import quan_ly_phuongtien.util.SuDungLienTuc;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static XeTaiService xeTaiService = new XeTaiService();
    private static OtoService otoService = new OtoService();
    private static XeMayService xeMayService = new XeMayService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("------Main Menu------");
            System.out.println("1.ThemPhuongTien\n" +
                    "2.HienThiPhuongTien\n" +
                    "3.XoaPhuongTien\n" +
                    "4.TimKiemPhuongTienTheoBienKiemSoat\n" +
                    "5.Exit");
            int choise = getChoise();
            switch (choise) {
                case 1 -> add();
                case 2 -> display();
                case 3 -> delete();
                case 4 -> timKiemTheoBienKiemSoat();
                case 5 -> System.exit(0);
            }
        }

    }

    private static void display() {
        System.out.println("1.XeTai\n" +
                "2.Oto\n" +
                "3.XeMay\n");
        int choise = getChoise();
        switch (choise) {
            case 1 -> {
                List<XeTai> xeTaiList = xeTaiService.findAll();
                for (int i = 0; i < xeTaiList.size(); i++) {
                    System.out.println(xeTaiList.get(i));
                }
            }
            case 2 -> {
                List<Oto> otoList = otoService.findAll();
                for (int i = 0; i < otoList.size(); i++) {
                    System.out.println(otoList.get(i));
                }
            }
            case 3 -> {
                List<XeMay> xeMayList = xeMayService.findAll();
                for (int i = 0; i < xeMayList.size(); i++) {
                    System.out.println(xeMayList.get(i));
                }
            }
        }
    }

    private static void delete() {
        System.out.println("nhap bien kiem soat de xoa");
        String bienKiemSoat = scanner.nextLine();
        if (xeTaiService.timKiemTonTaiPhuongTien(bienKiemSoat)) {
            xacNhanXoa(xeTaiService, bienKiemSoat);
        } else if (otoService.timKiemTonTaiPhuongTien(bienKiemSoat)) {
            xacNhanXoa(otoService, bienKiemSoat);
        } else if (xeMayService.timKiemTonTaiPhuongTien(bienKiemSoat)) {
            xacNhanXoa(xeMayService, bienKiemSoat);
        } else {
            System.out.println("khong ton tai phuong tien !!");
        }
    }

    private static void timKiemTheoBienKiemSoat() {
        System.out.println("nhap vao bien kiem soat can tim:");
        String bienKiemSoat = scanner.nextLine();

        List<XeTai> xeTaiList = xeTaiService.timKiemTheoBienKiemSoat(bienKiemSoat);
        List<Oto> otoList = otoService.timKiemTheoBienKiemSoat(bienKiemSoat);
        List<XeMay> xeMayList = xeMayService.timKiemTheoBienKiemSoat(bienKiemSoat);

        if (xeTaiList.size() == 0 && otoList.size() == 0 && xeMayList.size() == 0) {
            System.out.println("khong ton tai bien so xe !!");
        } else {
            xeTaiList.forEach(System.out::println);
            otoList.forEach(System.out::println);
            xeMayList.forEach(System.out::println);
        }
    }

    private static void add() {
        System.out.println("1.XeTai\n" +
                "2.Oto\n" +
                "3.XeMay\n");
        int choise = getChoise();
        System.out.println(" biển kiểm soát :");
        String bKS = scanner.nextLine();
        System.out.println("----danh sach hang san xuat ----");
        HangSanXuatService hangSanXuatService = new HangSanXuatService();
        List<HangSanXuat> hangSanXuatList = hangSanXuatService.findAll();
        for (int i = 0; i < hangSanXuatList.size(); i++) {
            System.out.println(hangSanXuatList.get(i));
        }
        System.out.println("nhap ten hang san xuat");
        String tenHangSanXuat = scanner.nextLine();
        HangSanXuat hangSanXuat = hangSanXuatService.timKiemTheoTen(tenHangSanXuat);
        System.out.println("nhap nam cua hang san xuat");
        int namHangSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("chu so huu");
        String chuSoHuu = scanner.nextLine();
        switch(choise){
            case 1 ->{
                System.out.println("trong tai :");
                Double trongTai = Double.parseDouble(scanner.nextLine());
                XeTai xeTai = new XeTai(bKS,hangSanXuat,namHangSanXuat,chuSoHuu,trongTai);
                xeTaiService.create(xeTai);
            }
            case 2 ->{
                System.out.println("so cho ngoi :");
                int soChoNgoi = Integer.parseInt(scanner.nextLine());
                System.out.println("kieu xe :");
                String kieuXe = scanner.nextLine();

                Oto oto = new Oto(bKS,hangSanXuat,namHangSanXuat,chuSoHuu,soChoNgoi, SuDungLienTuc.KieuXe.valueOf(kieuXe));
                otoService.create(oto);
            }
            case 3 ->{
                System.out.println("cong suat :");
                Double congSuat = Double.parseDouble(scanner.nextLine());
                XeMay xeMay = new XeMay(bKS,hangSanXuat,namHangSanXuat,chuSoHuu,congSuat);
                xeMayService.create(xeMay);
            }
        }
        System.out.println("tao thanh cong !!");
    }
    private static int getChoise(){
        System.out.println("lua chon cua ban :");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void xacNhanXoa(PhuongTienService phuongTienService,String bienKiemSoat){
        System.out.println("ban chac chan xoa muc nay khong:\n"+"1.Yes\n"+"2.No");
        int choise = getChoise();
        if(choise==1){
            phuongTienService.delete(bienKiemSoat);
            System.out.println("Da xoa Thanh Cong");
        }else{
            main(null);
        }
    }
}