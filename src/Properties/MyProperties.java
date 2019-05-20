package Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MyProperties {
    private final String FRANCAIS = "src/Properties/fr.properties.JSON";
    private final String ANGLAIS = "src/Properties/en.properties.JSON";

    public JSONObject readFile(String file) throws ParseException {
        JSONParser parser = new JSONParser();

        final JSONObject parse = (JSONObject) parser.parse(file);
        return parse;

    }

    public String readProperties(String key) throws ParseException {
        JSONObject file  = readFile(FRANCAIS);
        final String s = (String) file.get(key);
        return s;
    }
}
