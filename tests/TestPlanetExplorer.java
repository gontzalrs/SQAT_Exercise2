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
		int[] pos = new int[3];
		pos[0] = 0;
		pos[1] = 1;
		pos[2] = N;
		//Assert
		assertArrayEquals(pos, planet.getExplorerPosition());
	}
	
	@Test
	public void test_ffrff_22E() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		//Act
		String pos  = planet.executeCommand("ffrff");
		int[] pos = new int[3];
		pos[0] = 2;
		pos[1] = 2;
		pos[2] = E;
		//Assert
		assertArrayEquals("(2,2,"+E+")", planet.getExplorerPosition());
	}
}
