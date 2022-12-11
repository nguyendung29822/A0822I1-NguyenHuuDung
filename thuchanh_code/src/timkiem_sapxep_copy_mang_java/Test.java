package timkiem_sapxep_copy_mang_java;

import java.util.Arrays;

public class Test {
    public static int[] reverse(int[] x){
        int[] rv = new int[x.length];
        int index =0;
        for (int i = x.length-1; i >=0 ; i--) {
            rv[index] = x[i];
            index++;
        }
        return rv;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 7, 6, 9, 23};
        int[] b = new int[15];
        //hàm sắp xếp theo chiều tăng dần
        System.out.println("a ban đầu:" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("a sau khi sắp sếp:" + Arrays.toString(a));
        // hàm sắp sếp theo chiều giảm dần
        System.out.println("a sau khi sắp sếp giảm dần :"+Arrays.toString(Test.reverse(a)));

        //hàm tìm kiếm(đảm bảo là hàm đã tăng dần mới sử dụng đc)
        System.out.println(Arrays.binarySearch(a, 7));

        // hàm điền giá trị

        Arrays.fill(b,8);
        System.out.println(Arrays.toString(b));





    }
}
