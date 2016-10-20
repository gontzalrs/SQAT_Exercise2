
public class Explorer {
	private int x;
	private int y;
	private int Px;
	private int Py;
	private int direction;
	
	final int N = 0;
	final int E = 1;
	final int S = 2;
	final int W = 3;
	
	public Explorer(int Px, int Py) {
		x = 0;
		y = 0;
		direction = N;
		this.Px = Px;
		this.Py = Py;
	}
	
	public void turnLeft(){
		if(direction == N) direction = W;
		else direction--;
	}
	
	public void turnRight(){
		if(direction == W) direction = N;
		else direction ++;
	}
	
	public int moveForward(int[][] obs){
		int prevX = x;
		int prevY = y;
		switch(direction){
		case N:
			if(y==Py-1) y = 0;
			else y++;
			break;
		case S:
			if(y==0) y = Py-1;
			else y--;
			break;
		case E:
			if(x==Px-1) x = 0;
			else x++;
			break;
		case W:
			if(x==0) x = Px-1;
			else x--;
			break;
		}
		for(int[] o : obs){
			if(o[0]==x){
				if(o[1]==y){
					x = prevX;
					y = prevY;
					return -1;
				}
			}
		}
		return 0;
	}
	
	public void moveBackward(int[][] obs){
		switch(direction){
		case N:
			if(y==0) y = Py-1;
			else y--;
			break;
		case S:
			if(y==Py-1) y = 0;
			else y++;
			break;
		case E:
			if(x==0) x = Px-1;
			else x--;
			break;
		case W:
			if(x==Px-1) x = 0;
			else x++;
			break;
		}
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDirection() {
		return direction;
	}

}
