package ss4_class_object.thuc_hanh.quanly_bophim;

public class main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(22,11,2022);
        Ngay ngay2 = new Ngay(23,12,2023);
        Ngay ngay3 = new Ngay(24,1,2024);

        HangSanXuat hangSanXuat1 = new HangSanXuat("VTV","VietNam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("VTB","TrungQuoc");
        HangSanXuat hangSanXuat3 = new HangSanXuat("DisNey","My");


        BoPhim  boPhim1 = new BoPhim("phim A",2022,hangSanXuat1,10000,ngay1);
        BoPhim  boPhim2 = new BoPhim("phim B",2023,hangSanXuat2,20000,ngay2);
        BoPhim  boPhim3 = new BoPhim("phim C",2024,hangSanXuat3,30000,ngay3);


        hangSanXuat1.getTenHangSanXuat();
        hangSanXuat1.setTenHangSanXuat("NTB");
        hangSanXuat2.getTenHangSanXuat();
        hangSanXuat3.getTenHangSanXuat();

        System.out.println("so sánh giá vé của bộ phim 1 và bộ phim 3 :"+boPhim1.kiemTraGiaVeReHon(boPhim3));
        System.out.println("so sánh giá vé của bộ phim 1 và bộ phim 2 :"+boPhim1.kiemTraGiaVeReHon(boPhim2));


        System.out.println("tên hãng sản xuất phim của bộ phim 1 :"+boPhim1.layTenHangSanXuatPhim());
        System.out.println("tên hãng sản xuất phim của bộ phim 2 :"+boPhim2.layTenHangSanXuatPhim());
        System.out.println("tên hãng sản xuất phim của bộ phim 3 :"+boPhim3.layTenHangSanXuatPhim());


        System.out.println("giá sau km của bộ phim 1 là :"+boPhim1.giaSauKhuyenMai(10));
    }
}
