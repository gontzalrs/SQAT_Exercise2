import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	final int N = 0;
	final int E = 1;
	final int S = 2;
	final int W = 3;
	
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
		//Assert
		assertEquals(N, planet.getExplorerDirection());
	}
	
	@Test
	public void test_turnLeft_N() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		//Act
		planet.executeCommand("l");
		//Assert
		assertEquals(W, planet.getExplorerDirection());
	}
	
	@Test
	public void test_forwward_1() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		//Act
		planet.executeCommand("f");
		//Assert
		assertEquals(W, planet.getExplorerPosition());
	}
}
