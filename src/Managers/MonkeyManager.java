package Managers;

import Tree.Branch;
import Monkey.Monkey;

/**
 * Class that provides methods for counting of fruits on different types of trees
 * with helps of monkeys(Monkey class anonymous realizations)
 */
public class MonkeyManager {
    private Monkey bananaMonkey;
    private Monkey coconutMonkey;
    private Monkey allFruitsMonkey;

    /**
     * Counting only bananas
     *
     * @param branch a tree
     * @return count of bananas
     */
    public int countBananas(Branch branch) {
        bananaMonkey = new Monkey("Banana") {
        };
        return bananaMonkey.countFruits(branch);
    }

    /**
     * Counting only coconuts
     *
     * @param branch a tree
     * @return count of coconuts
     */
    public int countCoconuts(Branch branch) {
        coconutMonkey = new Monkey("Coconut") {
        };
        return coconutMonkey.countFruits(branch);
    }

    /**
     * Counting all fruits
     *
     * @param branch a tree
     * @return count of all fruits
     */
    public int countAllFruits(Branch branch) {
        allFruitsMonkey = new Monkey() {
        };
        return allFruitsMonkey.countFruits(branch);
    }
}
