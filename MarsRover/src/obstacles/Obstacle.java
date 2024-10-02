package obstacles;

// class representing an obstacle on the grid
public class Obstacle {
    private int x, y;

    public Obstacle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // check if the obstacle is at the given position
    public boolean isAtPosition(int x, int y) {
        return this.x == x && this.y == y;
    }
}
