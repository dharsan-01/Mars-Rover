package commands;

import rover.Rover;

// command interface for encapsulating rover commands
public interface Command {
    void execute(Rover rover);
}
