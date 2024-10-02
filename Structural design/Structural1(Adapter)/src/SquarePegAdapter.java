// Adapter class to adapt a square peg to a round hole
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    // Constructor to initialize the square peg that needs to be adapted
    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.squarePeg = peg;
    }

    // Overriding the method to adapt the square peg's width to a circular radius
    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
    }
}
