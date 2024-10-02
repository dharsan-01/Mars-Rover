package rover;

import grid.Grid;
import obstacles.Obstacle;
import util.Logger;

// class representing the mars rover
public class Rover {
    private int x, y;
    private Direction direction;
    private Grid grid;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    // move the rover one step forward in the current direction
    public void move() {
        int nextX = x + direction.getDeltaX();
        int nextY = y + direction.getDeltaY();
        
        if (grid.isWithinBounds(nextX, nextY) && !grid.isObstacle(nextX, nextY)) {
            x = nextX;
            y = nextY;
            Logger.log("Moved to: (" + x + ", " + y + ")");
        } else {
            Logger.log("Obstacle or boundary detected. Move aborted.");
        }
    }

    // turn the rover left
    public void turnLeft() {
        direction = direction.turnLeft();
        Logger.log("Turned left. Now facing: " + direction);
    }

    // turn the rover right
    public void turnRight() {
        direction = direction.turnRight();
        Logger.log("Turned right. Now facing: " + direction);
    }

    // status report of the rover position and direction
    public String getStatusReport() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction;
    }
}
