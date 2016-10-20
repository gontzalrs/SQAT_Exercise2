
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
	
	public void moveForward(){
		if(y==)
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}

}
