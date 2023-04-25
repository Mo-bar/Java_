package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputSteam {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file = new File("M:/Java_/docs.txt");
        FileInputStream fis = new FileInputStream(file);

        // int data;
        // while((data = fis.read()) != -1 ){
        //     System.out.print((char) data);
        // }
        //? autre methode.
        byte [] b = new byte[(int) file.length()];
        fis.read(b);
        String str = new String(b);
        System.out.println(str);
        fis.close(); 

    }
}
