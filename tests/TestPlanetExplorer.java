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
		//Assert
		assertEquals("(2,2,"+E+")", pos);
	}
	
	@Test
	public void test_backward_099N() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		//Act
		String pos  = planet.executeCommand("b");
		//Assert
		assertEquals("(0,99,"+N+")", pos);
	}
	
	@Test
	public void test_placeObstacles_3258() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"(3,2)(5,8)");
		//Act
		int[][] obs = new int[2][2];
		obs[0][0] = 3;
		obs[0][1] = 2;
		obs[1][0] = 5;
		obs[1][1] = 8;
		//Assert
		assertArrayEquals(obs, planet.getObstacles());
	}
	
	@Test
	public void test_backward_12E22() {
		//Arrange
		PlanetExplorer planet = new PlanetExplorer(100,100,"(2,2)");
		//Act
		String pos  = planet.executeCommand("ffrfff");
		//Assert
		assertEquals("(1,2"+ E +")(2,2)", pos);
	}
}
