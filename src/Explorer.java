
public class Explorer {
	private int x;
	private int y;
	
	private enum direction{
		N, E, S, W
	}
	public Explorer() {
		x = 0;
		y = 0;
		direction = N;
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
