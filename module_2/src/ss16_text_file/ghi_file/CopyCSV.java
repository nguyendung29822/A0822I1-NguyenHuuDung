package ss16_text_file.ghi_file;

import java.io.*;

public class CopyCSV {
    public static void main(String[] args) {
        try {
            File file = new File("src/ss16_text_file/doc_file/csv.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Country country = new Country(101, "11A", "dung");
            oos.writeObject(country);
            oos.flush();
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}