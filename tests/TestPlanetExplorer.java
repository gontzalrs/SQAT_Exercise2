import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_createPlanet100x100_100() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		//Act
		
		//Assert
		assertEquals(100, planet.getX());
	}
	
	@Test
	public void test_landExplorer_N() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		//Act
		explorer.land();
		//Assert
		assertEquals(N, planet.getDirection());
	}
}
