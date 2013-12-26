import java.util.ArrayList;


public class Map {
	private boolean obstacles[][];
	private String img[][];
	ArrayList<Snake> snakes;


	public Map () {
		obstacles = new boolean[32*64][32*64];
		img = new String[32*16][32*64];
		snakes = new ArrayList<Snake>();
	}

	public boolean isObstacle(int x, int y) {
		return obstacles[x][y];
	}

	public String getImg(int x, int y) {
		return img[x][y];
	}

}