package ss12_arraylist_linkedlist;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choise = 0;
        do {
            System.out.println("vui lòng lựa chọn chức năng ");
            System.out.println("1.thêm sản phẩm\n" +
                    "2.xóa sản phẩm\n" +
                    "3.hiển thị danh sách sản phẩm\n" +
                    "4.timfm kiếm sản phẩm theo tên\n" +
                    "5.sắp sếp sản phẩm tăng giảm dần theo gia\n" +
                    "6.sửa thông tin sản phẩm theo id");
            choise = sc.nextInt();
            sc.nextLine();
            if (choise == 1) {
                System.out.println("nhập tên sản phẩm :");
                String tenSanPham = sc.nextLine();
                System.out.println("nhập hãng sản xuat :");
                String hangSanXuat = sc.nextLine();
                System.out.println("nhập mã sản phẩm :");
                String maSanPham = sc.nextLine();
                System.out.println("nhập giá sản phẩm :");
                double giaSanPham = sc.nextDouble();
                Product p = new Product(tenSanPham, hangSanXuat, maSanPham, giaSanPham);
                productManager.themSanPham(p);

            } else if (choise == 3) {
                productManager.inDanhSachSanPham();
            } else if (choise == 2) {
                System.out.println("nhập vào mã sản phẩm :");
                String maSanPham = sc.nextLine();
                Product product = new Product(maSanPham);
                System.out.println("xóa sản phẩm khỏi danh sách " + productManager.xoaSanPham(product));
            } else if (choise==4) {
                System.out.println("nhập tên sản phẩm :");
                String tenSanPham = sc.nextLine();
                System.out.println("kết quả tìm kiếm :");
                productManager.timKiemSanPham(tenSanPham);
            }else if(choise==5){
                productManager.sapXepTangGiamDanTheoGia();
                productManager.inDanhSachSanPham();
            } else if (choise==6) {
                System.out.println("ma san pham:");
                String codeProduct = sc.nextLine();
                System.out.println("kết quả tìm kiếm là :" + productManager.kiemTraMaSP(codeProduct));
                if(productManager.kiemTraMaSP(codeProduct)){
                    System.out.println("nhập tên sản phẩm :");
                    String tenSanPham = sc.nextLine();
                    System.out.println("nhập hãng sản xuat :");
                    String hangSanXuat = sc.nextLine();
                    System.out.println("nhập giá sản phẩm :");
                    double giaSanPham = sc.nextDouble();
                    Product p = new Product(tenSanPham, hangSanXuat, codeProduct, giaSanPham);
                    productManager.suaSanPham(p);
                    System.out.println("Edit successful!");
                }else {
                    break;
                }



            }
        } while (choise != 0);


    }

}
