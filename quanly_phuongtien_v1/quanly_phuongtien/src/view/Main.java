package view;

import model.HangSanXuat;
import model.Oto;
import model.XeTai;
import service.HangSanXuatService;
import service.PhuongTienService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhuongTienService dsxetai = new PhuongTienService();
        PhuongTienService dsoto = new PhuongTienService();
        PhuongTienService dsxemay = new PhuongTienService();
        int luachon = 0;
        do {
            System.out.println("------CHƯƠNG TRINH QUẢN LÝ PHUONG TIỆN GIAO THÔNG------");
            System.out.println("vui lòng lựa chọn chức năng");
            System.out.println("1.them moi phuong tien\n" +
                    "2.hiển thị phương tiện\n" +
                    "3.xóa phương tiện\n" +
                    "4.tìm kiếm theo biển kiểm soát\n" +
                    "5.thoát");
            luachon = Integer.parseInt(scanner.nextLine());
            switch (luachon) {
                case 1:
                    System.out.println("vui lòng lựa chọn loại phương tiện cần thêm mới :");
                    System.out.println("1.xe tai\n" +
                            "2.oto\n" +
                            "3.xe may");
                    luachon = Integer.parseInt(scanner.nextLine());
                    if (luachon == 1) {
                        System.out.println("mời nhập biển kiểm soát :");
                        String bKS = scanner.nextLine();
                        System.out.println("danh sách hãng sản xuất");
                        HangSanXuatService hangSanXuatService = new HangSanXuatService();
                        List<HangSanXuat> hangSanXuatList = hangSanXuatService.findAll();
                        for (int i = 0; i < hangSanXuatList.size(); i++) {
                            System.out.println(hangSanXuatList.get(i));
                        }
                        System.out.println("mời nhập tên hãng sản xuất");
                        String ten = scanner.nextLine();
                        HangSanXuat tenHangSanXuat = hangSanXuatService.timKiemTheoTen(ten);
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat = Integer.parseInt(scanner.nextLine());
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu = scanner.nextLine();
                        System.out.println("mời nhaapoj trọng tải");
                        Double trongTai = Double.parseDouble(scanner.nextLine());
                        XeTai xeTai = new XeTai(bKS, tenHangSanXuat, namSanXuat, chuSoHuu, trongTai);
                        dsxetai.themPhuongTienXeTai(xeTai);
                    } else if (luachon == 2) {
                        System.out.println("mời nhập biển kiểm soát :");
                        String bKS = scanner.nextLine();
                        System.out.println("danh sách hãng sản xuất");
                        HangSanXuatService hangSanXuatService = new HangSanXuatService();
                        List<HangSanXuat> hangSanXuatList = hangSanXuatService.findAll();
                        for (int i = 0; i < hangSanXuatList.size(); i++) {
                            System.out.println(hangSanXuatList.get(i));
                        }
                        System.out.println("mời nhập tên hãng sản xuất");
                        String ten = scanner.nextLine();
                        HangSanXuat tenHangSanXuat = hangSanXuatService.timKiemTheoTen(ten);
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat = Integer.parseInt(scanner.nextLine());
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu = scanner.nextLine();
                        System.out.println("mời nhập số chỗ ngồi :");
                        Double soChoNgoi = Double.parseDouble(scanner.nextLine());
                        System.out.println("mời nhập kiểu xe :");
                        String kieuXe = scanner.nextLine();
                        Oto oto = new Oto(bKS, tenHangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
                        dsoto.themPhuongTienXeOto(oto);
                    }
                case 2:
                    dsxetai.hienThiDanhSachXeTai();
            }
        } while (luachon != 0);

    }
}
