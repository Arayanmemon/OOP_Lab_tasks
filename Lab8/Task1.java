import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file.json");
        JSONObject obj = new JSONObject();
        obj.put("Id", "47");
        obj.put("name", "Arayan");
        obj.put("Deptt", "Software");

        fw.write(obj.toJSONString());
        System.out.println("JSON file written successfully...");
        fw.close();

        JSONParser parser = new JSONParser();
        try {
            FileReader fr = new FileReader("file.json");
            Object ob = (Object) parser.parse(fr);
            String Id = (String)obj.get("Id");
            String name = (String)obj.get("name");
            String Deptt = (String)obj.get("Deptt");

            System.out.println("Name: "+ name);
            System.out.println("Id: "+Id);
            System.out.println("Department: "+ Deptt);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
