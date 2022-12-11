package catchuoi_noichuoi_thaythe_chuyendoi_java;

public class Demo {
    public static void main(String[] args) {
        String s1 ="nguyenDung";
        String s2 = "Code";
        String s3 = s1 + s2;
        //hàm concat => nối chuỗi
        String s4 = s1.concat(s2);

        System.out.println("s3 = "+s3);
        System.out.println("s4 = "+s4);

        // hàm replaceAll => thay thế

        String s5 = "Hello.vn";
        String s6 = s5.replaceAll("Hello","NguyenDung");
        System.out.println("s6 = "+s6);


        //toLowerCase => chuyển về viết thường
        //toUpperCase => chuyển về viết hoa

        String s7 = "NGUYEN DUNG";
        String s8 = s7.toLowerCase();
        System.out.println("s8 = "+s8);

        String s9 = s8.toUpperCase();
        System.out.println("s9 = "+s9);


        // trim() => xóa khoảng trắng dư thừa ở đầu chuỗi

        String s10 = "  xin chào các bạn";
        System.out.println(s10.trim());

        //subString => cắt chuỗi con

        String s11 = "xin chào các bạn,mình là Nguyễn Dũng";
        String s12 = s11.substring(10);
        String s13 = s12.substring(10,15);
        System.out.println("s12 = "+s12);
        System.out.println("s13 = "+s13);
    }
}
