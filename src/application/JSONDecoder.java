package application;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

public class JSONDecoder {

	static APIRetriever a = new APIRetriever();
	static JSONParser parser = new JSONParser();
	static String api;

	static JSONObject json;


	public JSONDecoder() {
		

	}
	public static void SetID(int id) {
		try {
		api = a.retrieveAPI(id);
		json = (JSONObject) parser.parse(api);
		json = (JSONObject) json.get("league");
		json = (JSONObject) json.get("standard");
		json = (JSONObject) json.get("stats");
		json = (JSONObject) json.get("regularSeason");
		JSONArray a = (JSONArray) json.get("season");
		json = (JSONObject) a.get(0);
		json = (JSONObject) json.get("total");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed Parse");
		}
	}

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
