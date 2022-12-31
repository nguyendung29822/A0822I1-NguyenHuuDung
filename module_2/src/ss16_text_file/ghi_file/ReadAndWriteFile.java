package ss16_text_file.ghi_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        final String SOURCE_PATH = "src/ss16_text_file/ghi_file/ReadAndWriteFile.java/source";
        final String TARGET_PATH = "src/ss16_text_file/ghi_file/ReadAndWriteFile.java/target";
        List<String> text = new ArrayList<>();
        File sourceFile = new File(SOURCE_PATH);
        File targetFile = new File(TARGET_PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader(sourceFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                text.add(line);
            }
            bufferedReader.close();
            fileReader.close();

            fileWriter = new FileWriter(targetFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String element: text) {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException e){
            e.getStackTrace();
        }catch (IOException e){
            e.getStackTrace();
        }

    }
}
