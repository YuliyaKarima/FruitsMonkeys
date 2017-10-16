package Tree;

import Fruit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Realization of Branch for branches that can hold both bananas and coconuts
 */
public class FruitsBranch extends Branch {
    private List<FruitsBranch> branches;
    private List fruits;
    private Random random = new Random();

    public FruitsBranch() {
        branches = new ArrayList<FruitsBranch>();
        fruits = new ArrayList();
    }

    @Override
    public void addBranch(int count) {
        for (int i = 0; i < count; i++) {
            branches.add(new FruitsBranch());
        }
    }

    @Override
    public void addFruits(int count) {
        int fruit;
        for (int i = 0; i < count; i++) {
            //using random number to define which fruit to fix to this branch
            fruit = random.nextInt(2);
            if (fruit == 1) {
                fruits.add(new Banana());
            } else if (fruit == 0) {
                fruits.add(new Coconut());
            }
        }
    }

    @Override
    public List<? extends Branch> getBranches() {
        return branches;
    }

    @Override
    public List<? extends Fruit> getFruits() {
        return fruits;
    }
}
