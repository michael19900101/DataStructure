package com.example.aotuman.datastructure;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SearchBinaryTreeTest {
    @Test
    public void test() throws Exception {
        /**
         *  5,2,7,3,4,1,6
         *
         *             5
         *          /   \
         *        2     7
         *      / \    /
         *     1  3   6
         *        \
         *        4
         *
         */

        int[] array=new int[]{5,2,7,3,4,1,6};
        SearchBinaryTree tree=new SearchBinaryTree();
        for (int i : array) {
            tree.put(i);
        }
        tree.midOrderTraverse(tree.root);

        // 删除结点7
        SearchBinaryTree.TreeNode node=tree.searchNode(array[2]);
        tree.delNode(node);

        System.out.println();
        System.out.println("-------------");
        tree.midOrderTraverse(tree.root);
    }
}
