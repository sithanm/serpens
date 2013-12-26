import java.io.Serializable;


class Move implements Serializable{
    private int move;
    public Move(int m) {
    	move = m;
    }

    public int getMove() {
    	return move;
    }
}