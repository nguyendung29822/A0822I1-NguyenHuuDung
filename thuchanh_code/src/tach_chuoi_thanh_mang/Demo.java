package tach_chuoi_thanh_mang;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String s = "xin chào các bạn";
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));
        String s1 = "xin chào, các bạn.minh là Dũng! hihi";
        String[] c = s1.split("\\.|\\,|\\!");
        System.out.println(Arrays.toString(c));

        String s2 = "Nguyen van B";
        String[] d = s2.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Ten :"+d[d.length-1]);
    }
}
