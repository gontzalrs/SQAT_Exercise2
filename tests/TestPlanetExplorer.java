import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		//Act
		
		//Assert
		assertEquals(100, planet.getX());
	}
}
