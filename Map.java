import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Map {
	private boolean obstacles[][];
	private String img[][];
	private List<Snake> snakes;


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

	public void update(DataPackage d) {
		Iterator i = d.getObstacles().iterator();
		ObstacleUpdate ou;
		while(i.hasNext()) {
			ou = (ObstacleUpdate)i.next();
			obstacles[ou.getx()][ou.gety()] = ou.isObst();
		}


		i = d.getImages().iterator();
		ImageUpdate iu;
		while(i.hasNext()) {
			iu = (ImageUpdate)i.next();
			img[iu.getx()][iu.gety()] = iu.getName();
		}

		snakes = d.getSnakes();
	}

}