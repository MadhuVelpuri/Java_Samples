package JSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileOutputStream;
import java.io.IOException;

public class UpdateJSON extends ReadJson{

    public static void main(String[] args) throws IOException, ParseException {

        updateJSON("Sample.json");
    }

    public static void updateJSON(String fileName) throws IOException, ParseException {

        JSONObject jsonObject = (JSONObject)ReadJson.readJson(fileName);

        jsonObject.put("Mobile","7036071540");

        System.out.println(jsonObject);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        fileOutputStream.write(jsonObject.toJSONString().getBytes());

fileOutputStream.close();

    }
}
