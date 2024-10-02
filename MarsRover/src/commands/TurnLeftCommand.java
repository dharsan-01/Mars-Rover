package commands;

import rover.Rover;

// command to turn the rover left
public class TurnLeftCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
