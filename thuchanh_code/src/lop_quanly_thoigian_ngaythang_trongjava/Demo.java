package lop_quanly_thoigian_ngaythang_trongjava;

public class Demo {
    public static void main(String[] args) {
        // hàm lấy ra giá trị thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("trước khi chạy for :" + t1);
        System.out.println("sau khi chạy for :" + t2);
        System.out.println("thời gian :" + (t2 - t1) / 1000 + "s");

        //

    }
}
