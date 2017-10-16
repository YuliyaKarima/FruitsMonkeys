package MonkeyTest;

import Managers.MonkeyManager;
import Managers.TreeManager;
import Tree.Branch;

public class TestMonkeys {


    public static void main(String[] args) {
        MonkeyManager monkeyManager = new MonkeyManager();
        TreeManager treeManager = new TreeManager();

        Branch bananaTree = treeManager.getBabanaTree();
        Branch coconutTree = treeManager.getCoconutTree();
        Branch fruitTree = treeManager.getFruitsTree();

        System.out.println("Count of coconuts on banana tree is " +
                +monkeyManager.countCoconuts(bananaTree));
        System.out.println("Count of coconuts on coconut tree is " +
                +monkeyManager.countCoconuts(coconutTree));
        System.out.println("Count of coconuts on fruit tree is " +
                +monkeyManager.countCoconuts(fruitTree));

        System.out.println("Count of bananas on banana tree is " +
                +monkeyManager.countBananas(bananaTree));
        System.out.println("Count of babanas on coconut tree is " +
                +monkeyManager.countBananas(coconutTree));
        System.out.println("Count of babanas on fruit tree is " +
                +monkeyManager.countBananas(fruitTree));

        System.out.println("Count of fruits on banana tree is " +
                +monkeyManager.countAllFruits(bananaTree));
        System.out.println("Count of fruits on coconut tree is " +
                +monkeyManager.countAllFruits(coconutTree));
        System.out.println("Count of fruits on fruit tree is " +
                +monkeyManager.countAllFruits(fruitTree));
    }

}