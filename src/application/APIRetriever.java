package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

public class APIRetriever {
	
	
	  public String retrieveAPI(int id)
	  {
		  String results ="";
	    try
	    {
	      String myUrl = "http://data.nba.net/10s/prod/v1//data/10s/prod/v1/2018/players/"+id+"_profile.json";


	      results = doHttpUrlConnectionAction(myUrl);
//	      System.out.println(results);
	    }
	    catch (Exception e)
	    {
	    }
	    return results;
	  }

	
	  private String doHttpUrlConnectionAction(String desiredUrl)
	  throws Exception
	  {
	    URL url = null;
	    BufferedReader reader = null;
	    StringBuilder stringBuilder;

	    try
	    {
	      // create the HttpURLConnection
	      url = new URL(desiredUrl);
	      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	      
	      // just want to do an HTTP GET here
	      connection.setRequestMethod("GET");
	      
	     
	      
	      // give it 15 seconds to respond
	      connection.setReadTimeout(15*1000);
	      connection.connect();

	      // read the output from the server
	      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	      stringBuilder = new StringBuilder();

	      String line = null;
	      while ((line = reader.readLine()) != null)
	      {
	        stringBuilder.append(line + "\n");
	      }
	      return stringBuilder.toString();
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	      throw e;
	    }
	    finally
	    {
	      // close the reader; this can throw an exception too, so
	      // wrap it in another try/catch block.
	      if (reader != null)
	      {
	        try
	        {
	          reader.close();
	        }
	        catch (IOException ioe)
	        {
	          ioe.printStackTrace();
	        }
	      }
	    }
	  }
	}


