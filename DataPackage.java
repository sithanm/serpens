import java.io.Serializable;
import java.util.ArrayList;


class DataPackage implements Serializable{
	private ArrayList<ObstacleUpdate> obst_upd;
	private ArrayList<ImageUpdate> img_upd;
	private ArrayList<Snake> snakes;

	public DataPackage(ArrayList<Snake> s) {
		snakes = s;
		obst_upd = new ArrayList<ObstacleUpdate>();
		img_upd = new ArrayList<ImageUpdate>();
	}

	public void addObstacle(ObstacleUpdate u) {
		obst_upd.add(u);
	}

	public void addImage(ImageUpdate u) {
		img_upd.add(u);
	}

	public ArrayList<Snake> getSnakes() {
		return snakes;
	}

	public ArrayList<ObstacleUpdate> getObstacles() {
		return obst_upd;
	}

	public ArrayList<ImageUpdate> getImages() {
		return img_upd;
	}

}