package application;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDecoder {

	static APIRetriever a = new APIRetriever();
	static JSONParser parser = new JSONParser();
	static String api;

	static JSONObject json;


	public JSONDecoder() {
		

	}
	public static void SetID(int id) {
		try {
			//retrives api of specified player
		api = a.retrieveAPI(id);
		//casts string to JSON object as it is in JSON format
		json = (JSONObject) parser.parse(api);
		//navigates to current year stats JSON 
		json = (JSONObject) json.get("league");
		json = (JSONObject) json.get("standard");
		json = (JSONObject) json.get("stats");
		json = (JSONObject) json.get("regularSeason");
		JSONArray a = (JSONArray) json.get("season");
		json = (JSONObject) a.get(0);
		//sets the JSON object to the current year stats
		json = (JSONObject) json.get("total");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed Parse");
		}
	}

	//all methods read stat from JSON and return the double value
	public  double getPoints() {
		double value = Double.parseDouble((String)json.get("ppg"));
		return value;
	}

	public  double getAssists() {
		double value = Double.parseDouble((String)json.get("apg"));
		return value;
	}
	public  double getRebounds() {
		double value = Double.parseDouble((String)json.get("rpg"));
		return value;
	}
	public  double getBlocks() {
		double value = Double.parseDouble((String)json.get("bpg"));
		return value;
	}
	public  double getSteals() {
		double value = Double.parseDouble((String)json.get("spg"));
		return value;
	}
	public  double getTurnovers() {
		double value = Double.parseDouble((String)json.get("topg"));
		return value;
	}
	public  double getFgp() {
		double value = Double.parseDouble((String)json.get("fgp"));
		return value;
	}
	public  double getTpp() {
		double value = Double.parseDouble((String)json.get("tpp"));
		return value;
	}
	public  double getFtp() {
		double value = Double.parseDouble((String)json.get("ftp"));
		return value;
	}
	public  double getMinutes() {
		double value = Double.parseDouble((String)json.get("mpg"));
		return value;
	}

}
