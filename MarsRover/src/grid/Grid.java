package grid;

import obstacles.Obstacle;
import java.util.List;

// class representing the grid on which the rover moves
public class Grid {
    private int width;
    private int height;
    private List<Obstacle> obstacles;

    public Grid(int width, int height, List<Obstacle> obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles = obstacles;
    }

    // check if a position is within the grid bounds
    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    // check if there is an obstacle at the given position
    public boolean isObstacle(int x, int y) {
        return obstacles.stream().anyMatch(obstacle -> obstacle.isAtPosition(x, y));
    }
}
