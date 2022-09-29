package FileOps;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Reader {


    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter(new File("Sample.txt"));
        fileWriter.write( " My Name \"is\" Madhu");

        fileWriter.close();

    FileReader fileReader = new FileReader("Sample.txt");
    int i = 0;
    while ((i = fileReader.read()) != -1) {

        System.out.println((char) i);

    }
    fileReader.close();
    }
}
