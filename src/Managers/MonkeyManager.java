package Managers;

import Fruit.*;
import Tree.BananaBranch;
import Tree.Branch;
import Tree.CoconutBranch;
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
        bananaMonkey = new Monkey() {
            int bananaCount = 0;

            @Override
            public int countFruits(Branch branch) {
                if (branch instanceof CoconutBranch) {
                    return 0;
                } else {
                    for (Fruit fruit : branch.getFruits()) {
                        if (fruit instanceof Banana) {
                            bananaCount += branch.getFruits().size();
                        }
                    }
                    if (!branch.getBranches().isEmpty()) {
                        for (Branch childBranch : branch.getBranches()) {
                            countFruits(childBranch);
                        }
                    }
                    return bananaCount;
                }
            }
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
        coconutMonkey = new Monkey() {
            int coconutCount = 0;

            @Override
            public int countFruits(Branch branch) {
                if (branch instanceof BananaBranch) {
                    return 0;
                } else {
                    for (Fruit fruit : branch.getFruits()) {
                        if (fruit instanceof Coconut) {
                            coconutCount += branch.getFruits().size();
                        }
                    }
                    if (!branch.getBranches().isEmpty()) {
                        for (Branch childBranch : branch.getBranches()) {
                            countFruits(childBranch);
                        }
                    }
                    return coconutCount;
                }
            }
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
            int fruitCount = 0;

            @Override
            public int countFruits(Branch branch) {

                for (Fruit fruit : branch.getFruits()) {
                    fruitCount += branch.getFruits().size();
                }
                if (!branch.getBranches().isEmpty()) {
                    for (Branch childBranch : branch.getBranches()) {
                        countFruits(childBranch);
                    }
                }
                return fruitCount;
            }
        };
        return allFruitsMonkey.countFruits(branch);
    }
}
