
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	private int x;
	private int y;
	private int[][] obstacles;
	private Explorer explorer;

	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x = x;
		this.y = y;
		int numOfObstacles = obstacles.length()/5;
		this.obstacles = new int[numOfObstacles][2];
		setObstacles(obstacles);
		explorer = new Explorer(x, y);
	}
	
	private void setObstacles(String obs){
		for(int i = 0; i<obs.length(); i++){
			char c = obs.charAt(i);
			if((i+1) % 5 == 2) obstacles[i/5][0] = c-'0';
			else if ((i+1) % 5 == 4) obstacles[i/5][1] = c-'0';
		}
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int[][] getObstacles(){
		return obstacles;
	}
	
	public int getExplorerDirection(){
		return explorer.getDirection();
	}
	
	public int[] getExplorerPosition(){
		int[] pos = new int[3];
		pos[0] = explorer.getX();
		pos[1] = explorer.getY();
		pos[2] = explorer.getDirection();
		return pos;
	}

	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		for(int i = 0; i<command.length(); i++){
			char c = command.charAt(i);
			switch(c){
			case 'l':
				explorer.turnLeft();
				break;
			case 'r':
				explorer.turnRight();
				break;
			case 'f':
				explorer.moveForward();
				break;
			case 'b':
				explorer.moveBackward();
				break;
			}
		}
		return "(" + explorer.getX() +","+ explorer.getY() +","+ explorer.getDirection() + ")";
	}
}
