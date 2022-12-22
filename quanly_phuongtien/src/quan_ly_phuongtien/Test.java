package quan_ly_phuongtien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachPhuongTien xeTai = new DanhSachPhuongTien();
        DanhSachPhuongTien xeOto = new DanhSachPhuongTien();
        DanhSachPhuongTien xeMay = new DanhSachPhuongTien();
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        System.out.println("Chọn Chức Năng :");
        System.out.println("---------------------------------------------");
        int choise = 0;
        do {
            System.out.println("1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            choise = scanner.nextInt();
            scanner.nextLine();
            if(choise==1){
                System.out.println("1.1.Xe Tải\n"+
                        "1.2.Xe Ô Tô\n"+
                        "1.3.Xe Máy\n");
                choise = scanner.nextInt();
                scanner.nextLine();
                switch (choise){
                    case 1:
                        System.out.println("mời nhập thông tin xe tải :----------");
                        System.out.println("mời nhập biển kiểm soát :");
                        String bienKiemSoat = scanner.nextLine();
                        System.out.println("mời nhập tên hãng sản xuất :");
                        String tenHangSanXuat = scanner.nextLine();
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat = scanner.nextInt();
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("mời nhập vào trọng tải :");
                        String trongTai = scanner.nextLine();
                        PhuongTien xeTai1 = new PhuongTien(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,trongTai);
                        xeTai.themPhuongTienXeTai(xeTai1);
                        break;
                    case 2 :
                       System.out.println("mời nhập vào thông tin xe ô tô :--------");
                        System.out.println("mời nhập biển kiểm soát :");
                        String bienKiemSoat1 = scanner.nextLine();
                        System.out.println("mời nhập tên hãng sản xuất :");
                        String tenHangSanXuat1 = scanner.nextLine();
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat1 = scanner.nextInt();
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu1 = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("mời nhập số chỗ ngồi :");
                        double soChoNgoi = scanner.nextDouble();
                        System.out.println("mời nhập kiểu xe :");
                        String kieuXe = scanner.nextLine();
                        scanner.nextLine();
                        PhuongTien xeOto1 = new PhuongTien(bienKiemSoat1,tenHangSanXuat1,namSanXuat1,chuSoHuu1,soChoNgoi,kieuXe);
                        xeOto.themPhuongTienXeOto(xeOto1);
                        break;
                    case 3 :
                        System.out.println("mời nhập vào thông tin xe máy :");
                        System.out.println("mời nhập biển kiểm soát :");
                        String bienKiemSoat2 = scanner.nextLine();
                        System.out.println("mời nhập tên hãng sản xuất :");
                        String tenHangSanXuat2 = scanner.nextLine();
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat2 = scanner.nextInt();
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu2 = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("mời nhập vào công suất :");
                        String congSuat = scanner.nextLine();
                        PhuongTien xeMay1 = new PhuongTien(bienKiemSoat2,tenHangSanXuat2,namSanXuat2,chuSoHuu2,congSuat);
                        xeMay.themPhuongTienXeMay(xeMay1);
                        break;
                }
            } else if (choise==2) {
                System.out.println("1.Hiển thị xe tải :\n"+
                        "2.Hiển thị xe ô tô :\n"+
                        "3.Hiển thị xe máy :\n");
                choise = scanner.nextInt();
                scanner.nextLine();
                switch (choise){
                    case 1:
                        System.out.println("hiển thị xe tải :");
                        xeTai.hienThiPhuongTienXeTai();
                        break;
                    case 2:
                        System.out.println("hiển thị xe ô tô :");
                        xeOto.hienThiPhuongTienXeOto();
                        break;
                    case 3:
                        System.out.println("hiển thị xe máy :");
                        xeMay.hienThiPhuongTienXeMay();
                        break;
                }

            }
        }while (choise!=0);
    }
}
