import java.util.List;
import java.util.ArrayList;


public class Snake {
	Position pos;
	int length;
	List <Position> elements;
	int direction;
	int previous_direction;

	public Snake(Position pos0, int length0, int dir0) {
		pos = pos0;
		length = length0;
		elements = new ArrayList <Position>();
		direction = dir0;
		previous_direction = -1;   //Not yet set
		for (int i = 0; i<length; i++) {
			elements.add(pos0.clone());
		}
	}

	public void turnleft() {
		//Something... else
	}

}