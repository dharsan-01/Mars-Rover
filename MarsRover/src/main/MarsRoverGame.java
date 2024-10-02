package main;

import commands.Command;
import commands.MoveCommand;
import commands.TurnLeftCommand;
import commands.TurnRightCommand;
import grid.Grid;
import obstacles.Obstacle;
import rover.Rover;
import rover.Direction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarsRoverGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get Grid Size
        System.out.println("Enter grid size (width height): ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        // get Starting Position and Direction
        System.out.println("Enter starting position (x y) and direction (N, E, S, W): ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        String directionInput = scanner.next().toUpperCase();
        Direction direction = parseDirection(directionInput);

        // get number of obstacles and their positions
        System.out.println("Enter number of obstacles: ");
        int numObstacles = scanner.nextInt();
        List<Obstacle> obstacles = new ArrayList<>();

        for (int i = 0; i < numObstacles; i++) {
            System.out.println("Enter obstacle " + (i + 1) + " position (x y): ");
            int obsX = scanner.nextInt();
            int obsY = scanner.nextInt();
            obstacles.add(new Obstacle(obsX, obsY));
        }

        // initialize the grid with user-provided obstacles
        Grid grid = new Grid(width, height, obstacles);

        // initialize the rover with the starting position and direction
        Rover rover = new Rover(startX, startY, direction, grid);

        // get the commands
        System.out.println("Enter a sequence of commands (M, L, R): ");
        String commandsInput = scanner.next().toUpperCase();
        List<Command> commands = parseCommands(commandsInput);

        // execute each command
        for (Command command : commands) {
            command.execute(rover);
        }

        // output the rover's final status
        System.out.println(rover.getStatusReport());
    }

    // to parse user input into a list of commands
    private static List<Command> parseCommands(String commandsInput) {
        List<Command> commands = new ArrayList<>();
        for (char commandChar : commandsInput.toCharArray()) {
            switch (commandChar) {
                case 'M':
                    commands.add(new MoveCommand());
                    break;
                case 'L':
                    commands.add(new TurnLeftCommand());
                    break;
                case 'R':
                    commands.add(new TurnRightCommand());
                    break;
                default:
                    System.out.println("Invalid command: " + commandChar);
                    break;
            }
        }
        return commands;
    }

    //to parse the direction input
    private static Direction parseDirection(String directionInput) {
        switch (directionInput) {
            case "N":
                return Direction.NORTH;
            case "E":
                return Direction.EAST;
            case "S":
                return Direction.SOUTH;
            case "W":
                return Direction.WEST;
            default:
                throw new IllegalArgumentException("Invalid direction: " + directionInput);
        }
    }
}
