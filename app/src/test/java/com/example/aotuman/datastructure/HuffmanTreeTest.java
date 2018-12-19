package com.example.aotuman.datastructure;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class HuffmanTreeTest {
    /**
     *  按权重排的
     *                          （390）
     *                        /       \
     *                   （190）      200
     *                  /     \
     *              (80)      110
     *             /   \
     *          (30)   50
     *         /   \
     *      10     20
     */
    @Test
    public void test() {
        ArrayList<HuffmanTree.TreeNode> list = new ArrayList<>();
        list.add(new HuffmanTree.TreeNode("good", 50));
        list.add(new HuffmanTree.TreeNode("morning", 10));
        list.add(new HuffmanTree.TreeNode("afternoon", 20));
        list.add(new HuffmanTree.TreeNode("hello", 110));
        list.add(new HuffmanTree.TreeNode("hi", 200));
        HuffmanTree tree = new HuffmanTree();
        tree.createHuffManTree(list);
        tree.showHuffman(tree.root);
//        tree.getCode(node2);
    }
}
