package taptin_thumuc.copy_object_xuong_taptin;

import java.io.*;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("src/taptin_thumuc/copy_object_xuong_taptin/file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            SinhVien st = new SinhVien("001", "dung", 2000, 10.0);
            oos.writeObject(st);
            oos.flush();
            oos.close();
        } catch (Exception e) {
        }
    }
}
