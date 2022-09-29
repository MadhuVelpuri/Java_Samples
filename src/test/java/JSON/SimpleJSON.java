package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileOutputStream;
import java.io.IOException;


public class SimpleJSON {

    static public void main(String[] a) throws IOException { // static and public can be written in any order
        writeJSON("Sample.JSON");
    }

    public static void writeJSON(String fileName) throws IOException {
        JSONObject json = new JSONObject();
        json.put("Name","Madhu");
        json.put("SurName","Velpuri");
        json.put("Age",28);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Hello..!!");
        jsonArray.add("What's up..!!");


        json.put("Messages",jsonArray);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write(json.toJSONString().getBytes());


    }


}
