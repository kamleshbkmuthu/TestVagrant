package testRCBApi;

import io.restassured.*;
import io.restassured.path.json.JsonPath;
public class Base {

	
	public int getNumberOfOverseasPlayers(String response) {
		
		JsonPath parseResponse = new JsonPath(response);
		int numberOfPlayers = parseResponse.getInt("player.size()");
		int numberOfOverseasPlayers = 0;
		for(int i=0;i<numberOfPlayers;i++) {
			
			if(!parseResponse.getString("player.country["+i+"]").equalsIgnoreCase("India")) 
				numberOfOverseasPlayers++;
		}
	
		return numberOfOverseasPlayers;
		
	}
	
	public int getNumberOfWicketKeepers(String response) {
		
		JsonPath parseResponse = new JsonPath(response);
		int numberOfPlayers = parseResponse.getInt("player.size()");
		int numberOfWicketKeepers = 0;
		for(int i=0;i<numberOfPlayers;i++) {
			
			
			if(parseResponse.getString("player.role["+i+"]").equalsIgnoreCase("Wicket-keeper")) 
				numberOfWicketKeepers++;
		}
		//System.out.println(numberOfWicketKeepers);
		return numberOfWicketKeepers;
		
	}
}
