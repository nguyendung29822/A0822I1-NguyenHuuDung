package ss16_text_file.doc_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ReadCSV {
    public static void main(String[] args) {
        try{
            File file = new File("src/ss16_text_file/doc_file/csv.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Country country = (Country) ois.readObject();
            System.out.println(country);
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
