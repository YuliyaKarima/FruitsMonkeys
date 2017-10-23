package tree;

import fruit.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Realization of Branch for branches that can hold only bananas
 */
public class BananaBranch extends Branch {
    private List<BananaBranch> branches;
    private List<Banana> bananas;

    public BananaBranch() {
        branches = new ArrayList<BananaBranch>();
        bananas = new ArrayList<Banana>();
    }

    @Override
    public void addBranch(int count) {
        for (int i = 0; i < count; i++) {
            branches.add(new BananaBranch());
        }
    }

    @Override
    public void addFruits(int count) {
        for (int i = 0; i < count; i++) {
            bananas.add(new Banana());
        }
    }

    @Override
    public List<? extends Branch> getBranches() {
        return branches;
    }

    @Override
    public List<? extends Fruit> getFruits() {
        return bananas;
    }
}
