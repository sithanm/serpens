public class ObstacleUpdate {
	private int x;
	private int y;
	private boolean isObst;

	public ObstacleUpdate(int x0, int y0, boolean s) {
		x = x0;
		y = y0;
		isObst = s;
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	public boolean isObst() {
		return isObst;
	}
}