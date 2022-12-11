package sosanh_chuoi_trong_java;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s;
//        System.out.println("nhập vào chuỗi 1 :");
//        s = scanner.nextLine();
        String s1 = "DungLapTrinh";
        String s2 = "dunglaptrinh";
        String s3 = "DungLapTrinh";

        //hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
        System.out.println("s1 equals s2 :" + s1.equals(s2));
        System.out.println("s1 equals s3 :" + s1.equals(s3));

        // hàm equalsIgnoreCase => so sánh 2 chuỗi giống nhau không biệt hoa thường
        System.out.println("s1 equalsIgnoreCase s2 :" + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3 :" + s1.equalsIgnoreCase(s3));

        // hàm compareTo => so sánh >,<,=
        String sv1 = "Nguyễn Văn A";
        String sv2 = "Nguyễn Văn B";
        String sv3 = "Nguyễn Văn A";
        String sv4 = "Nguyễn Văn";

        System.out.println("sv1 compareTo sv2" + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3" + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4" + sv1.compareTo(sv4));

        //hàm compareToIgnoreCase cũng là hàm so sánh <>=, nhưng mà không phân biệt chữ hoa chữ thường

        // hàm regionMatches => so sánh 1 đoạn

        String h1 = "NguyenDung";
        String h2 = "NguyenD";
        boolean check = h1.regionMatches(false,3,h2,0,4);
        System.out.println(check);

        // hàm startWith => kiểm tra chuỗi bắt đầu bằng ...
        String sdt = "0931379688";
        System.out.println(sdt.startsWith("093"));
        System.out.println(sdt.startsWith("090"));

        // hàm endWith => hàm kiểm tra chuỗi kết thúc bằng ...

        String nameFile = "hello.IMG";
        String nameFile2 = "goodbye.PDF";
        if(nameFile.endsWith(".IMG")){
            System.out.println("file là hình ảnh!");
        }else{
            System.out.println("file k phải là hình ảnh");
        }





    }
}
