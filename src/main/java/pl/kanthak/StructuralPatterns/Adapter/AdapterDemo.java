package pl.kanthak.StructuralPatterns.Adapter;

import pl.kanthak.Pattern;
import pl.kanthak.StructuralPatterns.Adapter.adapters.SquarePegAdapter;
import pl.kanthak.StructuralPatterns.Adapter.round.RoundHole;
import pl.kanthak.StructuralPatterns.Adapter.round.RoundPeg;
import pl.kanthak.StructuralPatterns.Adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class AdapterDemo implements Pattern {

    @Override
    public void process() {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
