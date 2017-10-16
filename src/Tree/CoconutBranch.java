package Tree;

import Fruit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Realization of Branch for branches that can hold only coconuts
 */
public class CoconutBranch extends Branch {
    private List<CoconutBranch> branches;
    private List<Coconut> coconuts;

    public CoconutBranch() {
        branches = new ArrayList<CoconutBranch>();
        coconuts = new ArrayList<Coconut>();
    }

    @Override
    public void addBranch(int count) {
        for (int i = 0; i < count; i++) {
            branches.add(new CoconutBranch());
        }
    }

    @Override
    public void addFruits(int count) {
        for (int i = 0; i < count; i++) {
            coconuts.add(new Coconut());
        }
    }

    @Override
    public List<? extends Branch> getBranches() {
        return branches;
    }

    @Override
    public List<? extends Fruit> getFruits() {
        return coconuts;
    }
}
