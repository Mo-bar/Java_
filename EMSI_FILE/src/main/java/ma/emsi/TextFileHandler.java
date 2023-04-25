package ma.emsi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TextFileHandler  {

    public static void createFile(File file) throws IOException {
        if(file.exists()) {
            System.out.println(file.getName()+" deja exist");
            return;
        }
        boolean test = file.createNewFile();
        if(test){
            System.out.println(file.getName()+" crée bien fait!");
        }
        System.out.println(file.getName()+" pas créé!!");

    }
    //! Insert data by FileOutputStream class
    public static void insertData(FileOutputStream file, String msg) throws IOException {
        byte[] msgByte = msg.getBytes();
        file.write(msgByte);
        file.close();
    }
    //! Insert data by FileWriter class
    public static void insertData(FileWriter file, String msg) throws IOException {
        file.write(msg);
        file.flush();
        file.close();

    }

    public static void main(String[] args) throws IOException {

        File file;
        file = new File("src/main/resources/inputDataText.txt");

        //? 	Créer un fichier inputDataText.txt
        createFile(file);


        FileOutputStream fos = new FileOutputStream(file);
        String laps = " Asus | Windows | MEDUIM ";
        laps += "\n Dell | UBUNTO | LARGE ";
        laps += "\n Mac book | Mac | SMALL";

        //! Insert data by FileOutputStream class
        //insertData(fos,laps);

        //! Insert data by FileWriter class
        insertData(new FileWriter(file, true), laps);

        //? 	extraire les informations existantes dans le fichier inputDataText.txt
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        List<Laptop> laptops = new ArrayList<>();
        while (line != null){
            String[] str = line.split("\\|");
            laptops.add(new Laptop(str[0].trim(),str[1].trim(), Laptop.Size.valueOf(str[2].trim())));
            line = br.readLine();
        }
        //? stocker les données de List dans un nouveau Fichier outputDateText.txt
        File outFile = new File("src/main/resources/outputDataText.txt");
        FileWriter fileWriter = new FileWriter(outFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Laptop laptop : laptops) {
            String string = laptop.toString();
                bufferedWriter.write(string);
                bufferedWriter.flush();

        }
        bufferedWriter.close();
    }
    /**
     *         laptops.stream().map(Laptop::toString).forEach(str -> {
     *             try{
     *                 bufferedWriter.write(str); bufferedWriter.flush();
     *             }catch (IOException e){
     *                 System.out.println(e);
     *             }
     *
     *         });
     */

}
