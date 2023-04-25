package ma.emsi;

import java.io.*;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileHandler {
    public static void createFile(File file) throws IOException {

        if (!file.exists()) {
            boolean test = file.createNewFile();
            if (test) {
                System.out.println(file.getName() + " crée bien fait!");
                return;
            } else {
                System.out.println(file.getName() + " pas créé!!");
            }
        }
        System.out.println(file.getName() + " deja exist");

    }

    public static void main(String[] args) throws IOException {
        File file;
        file = new File("src/main/resources/inputDataJson.json");
        //? creation inputDataJson.json
        createFile(file);

        //? 	extraire les informations existantes dans le fichier inputDataText.txt
        JSONParser parser = new JSONParser();

        try{
            Object obj =  parser.parse(new FileReader(file));
            JSONObject jsnObject = (JSONObject) obj;
            //int serial = Integer.parseInt((String) jsnObject.get("serial"));
            String marque = (String) jsnObject.get("Marque");
            String os = (String) jsnObject.get("Operating system");
            String size = (String) jsnObject.get("Size");
            JSONArray ary = (JSONArray) jsnObject.get("Config");

            System.out.println("Laptop{" +
                    "\n\tSerial : " + 1 +
                    ",\n\tMarque : '" + marque + '\'' +
                    ",\n\tOperating system : '" + os + '\'' +
                    ",\n\tSize : " + size +
                    "\n\tConfig : {");
            Iterator<String> it = ary.iterator();
            while (it.hasNext()){
                System.out.println("\t\t"+it.next());
            }
            System.out.println("\t} \n}");

            //? creation outputDataJson.json
            File out;
            out = new File("src/main/resources/outputDataJson.json");
            createFile(out);

            //? stocker les données de List dans un nouveau Fichier outputDateText.txt
            BufferedWriter bw = new BufferedWriter(new FileWriter(out));
            bw.write(jsnObject.toString());
            bw.flush();
            bw.close();

        }catch( Exception e){
            System.out.println(e);

        }
    }
}


































