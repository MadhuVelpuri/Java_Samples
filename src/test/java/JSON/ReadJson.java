package JSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {

    public static void main(String[] args) throws IOException, ParseException {

        JSONObject jsonObject = (JSONObject)readJson("Sample.Json");
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("Name"));
    }

    public static Object readJson(String fileName) throws IOException, ParseException {
        FileReader fileReader = new FileReader(fileName);

        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(fileReader);
    }
}
