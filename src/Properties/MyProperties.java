package Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyProperties {
    private final String FRANCAIS = "src/Properties/fr.properties.JSON";
    private final String ANGLAIS = "src/Properties/en.properties.JSON";

    public JSONObject readFile(String file) throws ParseException {
        JSONParser parser = new JSONParser();
        // Change fileReader Parameter to change the language
        try(Reader r = new FileReader(ANGLAIS)) {
            return (JSONObject) parser.parse(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readProperties(String key) throws ParseException {
        JSONObject file  = readFile(ANGLAIS);
        return (String) file.get(key);
    }
}
