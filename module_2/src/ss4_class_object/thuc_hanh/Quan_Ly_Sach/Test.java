package ss4_class_object.thuc_hanh.Quan_Ly_Sach;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 5, 2021);
        Ngay ngay2 = new Ngay(17, 9, 2023);
        Ngay ngay3 = new Ngay(20, 11, 2021);

        TacGia tacGia1 = new TacGia("Nguyen Van A", ngay1);
        TacGia tacGia2 = new TacGia("Nguyen Van B", ngay2);
        TacGia tacGia3 = new TacGia("Nguyen Van C", ngay3);

        Sach sach1 = new Sach("CodeGym1", 15000, 2021, tacGia1);
        Sach sach2 = new Sach("CodeGym2", 21000, 2025, tacGia2);
        Sach sach3 = new Sach("CodeGym3", 20000, 2021, tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("so sanh NXB cua Sach1 va Sach3 " + sach1.kiemTraCungNam(sach3));
        System.out.println("so sanh NXB cua sach1 va sach2 " + sach1.kiemTraCungNam(sach2));

        System.out.println("sach1 giam 20% " + sach1.giaSauKhiGiam(20));
        System.out.println("sach3 giam 10% " + sach3.giaSauKhiGiam(10));


    }
}


