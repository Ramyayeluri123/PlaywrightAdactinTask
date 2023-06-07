package com.DataManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadDataFromJsom {
        public String readValueFromJson(String attribute) throws FileNotFoundException{
            Object obj = null;
            try {
                obj = new JSONParser().parse(new FileReader(System.getProperty("user.dir")+"/src/main/resources/JsonTestData"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            JSONObject jsonObject = (JSONObject)obj;
            String jsonData = jsonObject.get(attribute).toString();
            System.out.println("jsonData ::" +jsonData);
            return jsonData;
        }
}



