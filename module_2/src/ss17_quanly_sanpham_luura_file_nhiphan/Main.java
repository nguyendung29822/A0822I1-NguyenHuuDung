package ss17_quanly_sanpham_luura_file_nhiphan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSanPham danhSachSanPham = new DanhSachSanPham();
        int luachon = 0;
        do {
            System.out.println("------DanhSachLuaChon------");
            System.out.println("vui long lua chon chuc nang");
            System.out.println("1.them san pham\n"+
                    "2.hien thi san pham\n"+
                    "3.tim kiem san pham theo ma\n"+
                    "4.luu file\n"+
                    "5.doc file");
            luachon = Integer.parseInt(scanner.nextLine());
            switch (luachon){
                case 1:
                    System.out.println("moi nhap ma san pham :");
                    String maSP = scanner.nextLine();
                    System.out.println("moi nhap ten san pham :");
                    String tenSP = scanner.nextLine();
                    System.out.println("moi nhap hang san xuat :");
                    String hangSP = scanner.nextLine();
                    System.out.println("moi nhap gia san pham :");
                    Double giaSP = Double.parseDouble(scanner.nextLine());
                    SanPham sanPham = new SanPham(maSP,tenSP,hangSP,giaSP);
                    danhSachSanPham.themSanPham(sanPham);
                    break;
                case 2:
                    danhSachSanPham.hienThiDanhSachSanPham();
                    break;
                case 3:
                    System.out.println("moi nhap ma san pham:");
                    String maID = scanner.nextLine();
                    System.out.println("ket qua tim kiem :");
                    danhSachSanPham.timKiemSanPham(maID);
                    break;
                case 4 :
                    DanhSachSanPham.ghiFileNhiPhan("src/ss17_quanly_sanpham_luura_file_nhiphan/dssp.txt", danhSachSanPham.getDanhSach());
                    break;
                case 5 :
                    DanhSachSanPham.docFileNhiPhan("src/ss17_quanly_sanpham_luura_file_nhiphan/dssp.txt");
                    break;
            }
        }while (luachon!=0);
    }
}
