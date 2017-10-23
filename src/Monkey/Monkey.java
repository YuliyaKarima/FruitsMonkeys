package Monkey;

import Fruit.*;
import Tree.Branch;

/**
 * Abstract class Monkey provides method for counting fruits on a tree
 */
public abstract class Monkey {

    private int fruitsCount;
    private Class<?> fruitClass;

    /**
     * @param fruitType String name of the fruit that monkey will be count
     */
    public Monkey(String fruitType) {
        try {
            fruitClass = Class.forName("Fruit." + fruitType);
        } catch (ClassNotFoundException e) {
            System.err.println("class not found");
        }
    }

    /**
     * In this case a monkey has no fruit specialization
     */
    public Monkey() {
        fruitClass = null;
    }

    /**
     * Method for counting fruits on a tree
     */
    public int countFruits(Branch branch) {
        for (Fruit fruit : branch.getFruits()) {
            if (fruitClass != null) {
                if (fruit.getClass() == fruitClass) {
                    fruitsCount += branch.getFruits().size();
                }
            } else {
                fruitsCount += branch.getFruits().size();
            }
            if (!branch.getBranches().isEmpty()) {
                for (Branch childBranch : branch.getBranches()) {
                    countFruits(childBranch);
                }
            }
        }
        return fruitsCount;
    }
}
