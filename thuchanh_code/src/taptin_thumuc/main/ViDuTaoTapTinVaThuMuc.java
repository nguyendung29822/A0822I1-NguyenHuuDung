package taptin_thumuc.main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        // lưu ý :
        // MS Windows : \=>\\ ví dụ : "C:\\Thu muc1\\Thu muc\\Ten tap tin.xxx";
        // Linux, MacOS : / ví dụ : "/thu muc 1/thu muc 2/ten tap tin.xxx"
        // kiểm tra thư mục hoặc tập tin có tồn tại hay không
        File folder1 = new File("xxx");
        System.out.println("kiểm tra folder1 có tồn tại hay không : "+folder1.exists());
        // tạo thư mục
        // phương thức mkdir() => tạo 1 thư mục
        File d1 = new File("xx");
        d1.mkdir();
        // phương thức mkdirs() => tạo nhiều thư mục cùng lúc
        File d2 = new File("xxx/xxy/xxz");
        d2.mkdirs();

        // tạo ra 1 tập tin (có phần mở rộng: .exe, .txt, .doc, .xls...)
        File file1 = new File("xxx/vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
