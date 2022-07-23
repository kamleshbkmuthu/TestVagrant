package testRCBApi;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.InputData;
public class ApiTest extends Base {
	
	
	InputData d = new InputData();
	
	@Test
	public void  validateFourOverseasPlayers() {
		
		String response = d.getJsonData();
		int actualOverseasPlayersCount = getNumberOfOverseasPlayers(response);
		int expectedOverseasPlayersCount = 4;	
		Assert.assertEquals(expectedOverseasPlayersCount,actualOverseasPlayersCount,"Expected count of overseas players : "+ expectedOverseasPlayersCount +
				"but actual count of overseas players: " + expectedOverseasPlayersCount);
	}

	@Test
	public void  validateAtleastOneWicketKeeperPlays() {
		
		String response = d.getJsonData();
		int actualOverseasPlayersCount = getNumberOfOverseasPlayers(response);
		Assert.assertTrue(actualOverseasPlayersCount>=1,"There are no wicket keepers playing in the team");
	}
	
}
