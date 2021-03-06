package managers;

import tree.BananaBranch;
import tree.Branch;
import tree.CoconutBranch;
import tree.FruitsBranch;

import java.util.Random;

/**
 * tree factory
 */
public class TreeManager {
    private Random random = new Random();

    public Branch getFruitsTree() {
        Branch mainFruitsBranch = new FruitsBranch();
        growTree(mainFruitsBranch, 3);
        return mainFruitsBranch;
    }

    public Branch getBananaTree() {
        Branch mainBananaBranch = new BananaBranch();
        growTree(mainBananaBranch, 3);
        return mainBananaBranch;
    }

    public Branch getCoconutTree() {
        Branch mainCoconutBranch = new CoconutBranch();
        growTree(mainCoconutBranch, 3);
        return mainCoconutBranch;
    }

    /**
     * Add branches to a branch using recursion
     *
     * @param branch current branch for fixing other branches
     * @param level  branch nesting level
     */
    private void addBranches(Branch branch, int level) {
        branch.addBranch(random.nextInt(10));
        if (level > 0) {
            for (Branch childBranch : branch.getBranches()) {
                addBranches(childBranch, level - 1);
            }
        }
    }

    /**
     * Add fruits to a branch using recursion
     *
     * @param branch a branch to which fruits will be added
     */
    private void addFruits(Branch branch) {
        branch.addFruits(random.nextInt(10));
        if (!branch.getBranches().isEmpty()) {
            for (Branch childBranch : branch.getBranches()) {
                addFruits(childBranch);
            }
        }
    }

    /**
     * Construct a tree
     *
     * @param branch a branch to which fruits and other branches will be added
     * @param level  branch nesting level
     */
    private void growTree(Branch branch, int level) {
        addBranches(branch, level);
        addFruits(branch);
    }
}
