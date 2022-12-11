package tim_kiem_chuoi_java;

public class Demo {
    public static void main(String[] args) {
        String s1 = "xin chào cô chú, xin chào các bạn, xin chào ";
        String s2 = "xin chào";
        String s3 = "123 xin chào";
        char c1 = 'h';
        //hàm indexof

        System.out.println("vị trí s2 ở trong s1 :"+s1.indexOf(s2));
        System.out.println("vị trí s2 ở trong s3 :"+s3.indexOf(s2));
        System.out.println("vị trí s3 trong s1 :"+s1.indexOf(s3));
        //sử dụng vị trí bắt đầu

        System.out.println("vị trí của s2 trong s1 :"+s1.indexOf(s2,1));

        // tìm kiếm char

        System.out.println("vị trí của c1 trong s1 :"+s1.indexOf(c1));
        System.out.println("vị trí của c1 trong s1 :"+s1.indexOf(c1,10));

        // hàm lastIndexof => tìm kiếm từ phải sang trái
        System.out.println("vị trí s2 trong s1 :"+s1.lastIndexOf(s2));
    }
}
