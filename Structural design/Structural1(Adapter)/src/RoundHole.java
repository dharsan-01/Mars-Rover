// Class representing a round hole
public class RoundHole {
    private double radius;

    // Constructor to initialize the hole's radius
    public RoundHole(double radius) {
        this.radius = radius;
    }

    // Method to check if a peg fits into the hole
    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
