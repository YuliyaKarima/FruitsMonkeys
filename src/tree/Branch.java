package tree;

import fruit.Fruit;

import java.util.List;

/**
 * Abstract class Branch provides methods for adding other branches to a branch
 * and for adding friuts to a branch
 */
public abstract class Branch {
    /**
     * Fix other branches to this branch
     *
     * @param count count of branches fixed to this branch
     */
    public abstract void addBranch(int count);

    /**
     * Fix fruits to this branch
     *
     * @param count count of fruits fixed to this branch
     */
    public abstract void addFruits(int count);

    public abstract List<? extends Branch> getBranches();

    public abstract List<? extends Fruit> getFruits();
}
