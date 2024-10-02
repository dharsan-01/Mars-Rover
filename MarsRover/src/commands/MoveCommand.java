package commands;

import rover.Rover;

// command to move the rover forward in the current direction
public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.move();
    }
}
