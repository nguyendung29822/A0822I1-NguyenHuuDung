package taptin_thumuc.doc_object_tutaptin;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DocDoiTuong {
    public static void main(String[] args) {
        try{
            File file = new File("src/taptin_thumuc/copy_object_xuong_taptin/file.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien st = (SinhVien) ois.readObject();
            // lấy thông tin tùy ý
            System.out.println(st.getDiemTB());
            System.out.println(st);
            ois.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
