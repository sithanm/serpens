public class ImageUpdate {
	private String name;
	private int x;
	private int y;

	public ImageUpdate(int xx, int yy, String n) {
		x = xx;
		y = yy;
		name = n;
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	public String getName() {
		return name;
	}
}