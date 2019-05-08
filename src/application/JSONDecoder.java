package application;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDecoder {
	
	APIRetriever a = new APIRetriever();
	JSONParser parser = new JSONParser();
	String api = a.retrieveAPI(202331);

	JSONObject json;
	
	public JSONDecoder() {
		try {
			json = (JSONObject) parser.parse(api);
			System.out.println(json.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Parse Failed");
		}
	}
	
	
}
