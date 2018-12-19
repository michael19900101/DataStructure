package com.example.aotuman.datastructure;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AVLBTreeTest {

    /**结果
     *                   1
     *                /   \
     *              0     5
     *            /     /  \
     *         -2     2    8
     */

    @Test
    public void test() {
        Integer[] nums = {5, 8, 2, 0, 1, -2};
        AVLBTree<Integer> tree = new AVLBTree<>();
        for (int i = 0; i < nums.length; i++) {
            tree.insertElement(nums[i]);
        }
        tree.showAVL(tree.root);
    }
}
