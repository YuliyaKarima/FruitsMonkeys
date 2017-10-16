package Managers;

import Tree.Branch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyManagerTest {
    MonkeyManager monkeyManager;
    TreeManager treeManager;
    Branch bananaTree;
    Branch coconutTree;
    Branch fruitTree;

    @Before
    public void setUp() throws Exception {
        monkeyManager = new MonkeyManager();
        treeManager = new TreeManager();
        bananaTree = treeManager.getBabanaTree();
        coconutTree = treeManager.getCoconutTree();
        fruitTree = treeManager.getFruitsTree();
    }

    @Test
    public void coconutMonkeyMustCountZeroCoconutsOnBananaTree() {
        //given
        int expected = 0;
        //when
        int actual = monkeyManager.countCoconuts(bananaTree);
        //then
        assertEquals("test failed", expected, actual);
    }

    @Test
    public void bananaMonkeyMustCountZeroBananaOnCoconutTree() {
        //given
        int expected = 0;
        //when
        int actual = monkeyManager.countBananas(coconutTree);
        //then
        assertEquals("test failed", expected, actual);
    }

    @Test
    public void fruitMonkeyMustCountEqualFruitsAsCoconutAndBananasMonkeyOnFruitTree() {
        int coconuts = monkeyManager.countCoconuts(fruitTree);
        int bananas = monkeyManager.countBananas(fruitTree);
        int expected = coconuts + bananas;
        //when
        int actual = monkeyManager.countAllFruits(fruitTree);
        //then
        assertEquals("test failed", expected, actual);
    }

}