public class Position {
	private int x, y;
	Position() {
		x = 0;
		y = 0;
	}
	Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setx(int x) {
		this.x = x;
	}
	public void sety(int y) {
		this.y = y;
	}

	public int gety() {
		return y;
	}
	public int getx() {
		return x,
	}

	public Position clone() {
		return new Position(x, y);
	}
}