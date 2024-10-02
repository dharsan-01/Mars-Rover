package commands;

import rover.Rover;

// command to turn the rover right
public class TurnRightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
