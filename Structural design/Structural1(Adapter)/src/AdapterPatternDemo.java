public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Creating a round hole with a specific radius
        RoundHole roundHole = new RoundHole(5);
        
        // Creating a round peg with the same radius
        RoundPeg roundPeg = new RoundPeg(5);

        // Checking if the round peg fits into the round hole
        System.out.println("Round peg fits in the round hole: " + roundHole.fits(roundPeg));

        // Creating a square peg with a width of 5
        SquarePeg squarePeg = new SquarePeg(5);

        // Creating an adapter for the square peg
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);

        // Checking if the adapted square peg fits into the round hole
        System.out.println("Square peg fits in the round hole: " + roundHole.fits(adapter));
    }
}
