package taptin_thumuc.doc_object_tutaptin;


import quanly_sinhvien_sudung_arrraylist.DanhSachSinhVien;
import quanly_sinhvien_sudung_arrraylist.SinhVien;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choise = 0;
        do {
            System.out.println("-------MENU-----");
            System.out.println("Vui Long Chon Chuc Nang :");
            System.out.println("1.Them Sinh Vien Vao Danh Sach\n" +
                    "2.In Danh Sach Sinh Vien Ra Man Hinh\n" +
                    "3.Kiem Tra Danh Sach Co Rong Hay Khong\n" +
                    "4.Lay Ra So Luong Sinh Vien Trong Danh Sach\n" +
                    "5.Lam Rong Danh Sach Sinh Vien\n" +
                    "6.Kiem Tra Sinh Vien Co Ton Tai Trong Danh Sach Hay Khong\n" +
                    "7.Xoa Mot Sinh Vien Ra Khoi Danh Sach Dua Tren Ma Sinh Vien\n" +
                    "8.tim Kiem Tat Ca Sinh Vien Dua Tren Ten Duoc Tim Kiem Tu Ban Phim\n" +
                    "9.Xuat Ra Danh Sach Sinh Vien Co Diem Tu Cao Den Thap\n" +
                    "10.Sửa thông tin sinh viên theo mã sinh viên\n"+
                    "11.lưu danh sách sinh viên xuống tập tin\n"+
                    "0.Thoat Chuong Trinh\n");
            choise = sc.nextInt();
            sc.nextLine();
            // them sinh vien vao danh sach
            if (choise == 1) {
                System.out.println("nhap ma sinh vien :");
                String maID = sc.nextLine();
                System.out.println("nhap ho va ten :");
                String hoVaTen = sc.nextLine();
                System.out.println("nhap nam sinh :");
                int namSinh = sc.nextInt();
                System.out.println("nhap diem trung binh :");
                double dTB = sc.nextDouble();
                SinhVien sv = new SinhVien(maID, hoVaTen, namSinh, dTB);
                dssv.themSinhVien(sv);
                // in danh sach sinh vien ra man hinh
            } else if (choise == 2) {
                dssv.inDanhSachSinhVien();
                // kiểm tra danh sách có rỗng hay không
            } else if (choise == 3) {
                System.out.println(dssv.kiemTraDanhSachRong());
                // lấy ra số lượng sinh viên trong danh sách
            } else if (choise == 4) {
                System.out.println("số lương sinh viên trong danh sách là : " + dssv.laySoLuongSinhVien());
                // làm rỗng danh sách
            } else if (choise == 5) {
                dssv.lamRongDanhSach();
                // kiểm tra tồn tại của sinh viên trong danh sách
            } else if (choise == 6) {
                System.out.println("nhap ma sinh vien :");
                String maID = sc.nextLine();
                SinhVien sv = new SinhVien(maID);
                dssv.kiemTraSinhVienTonTai(sv);
                // xóa 1 sinh viên ra khỏi danh sách
            } else if (choise == 7) {
                System.out.println("nhap ma sinh vien :");
                String maID = sc.nextLine();
                SinhVien sv = new SinhVien(maID);
                System.out.println("xóa sinh viên ra khỏi ds :" + dssv.xoaSinhVien(sv));
            } else if (choise == 8) {
                System.out.println("nhap ho va ten :");
                String hoVaTen = sc.nextLine();
                System.out.println("kết quả tìm kiếm :");
                dssv.timKiemSinhVien(hoVaTen);
            } else if (choise == 9) {
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhVien();
            }else if(choise==10){
                System.out.println("mời nhập mã sinh viên cần sửa :");
                String maSV = sc.nextLine();
                System.out.println("kết quả tìm kiếm là :"+dssv.kiemTraMaSV(maSV));
                boolean ketQua = dssv.kiemTraMaSV(maSV);
                if(ketQua){
                    System.out.println("nhap ho va ten :");
                    String hoVaTen = sc.nextLine();
                    System.out.println("nhap nam sinh :");
                    int namSinh = sc.nextInt();
                    System.out.println("nhap diem trung binh :");
                    double dTB = sc.nextDouble();
                    SinhVien sv = new SinhVien(maSV, hoVaTen, namSinh, dTB);
                    dssv.suaThongtin(sv);
                    System.out.println("Edit successful !");
                }

            } else if (choise==11) {
                System.out.println("nhap ten file");
                String tenFile = sc.nextLine();
                File f = new File(tenFile);
                dssv.ghiDuLieuXuongFile(f);

            }
        } while (choise != 0);
    }
}
