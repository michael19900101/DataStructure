package com.example.aotuman.datastructure;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class HuffmanTree {
    TreeNode root;

    public TreeNode createHuffManTree(ArrayList<TreeNode> list) {
        while (list.size() > 1) {
            Collections.sort(list);
            TreeNode left = list.get(list.size() - 1);
            TreeNode right = list.get(list.size() - 2);
            TreeNode parent = new TreeNode("中间节点", left.weight + right.weight);
            parent.leftChild = left;
            left.parent = parent;
            parent.rightChild = right;
            right.parent = parent;
            list.remove(left);
            list.remove(right);
            list.add(parent);
        }
        root = list.get(0);
        return list.get(0);
    }

    public void showHuffman(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);//入队
        while (!list.isEmpty()) {
            TreeNode node = list.pop();
            System.out.println("节点："+node.data +",权重:" + node.weight);
            if (node.leftChild != null) {
                list.offer(node.leftChild);
            }
            if (node.rightChild != null) {
                list.offer(node.rightChild);
            }
        }
    }

    /**
     * 编码
     */
    public void getCode(TreeNode node) {
        TreeNode tNode = node;
        Stack<String> stack = new Stack<>();
        while (tNode != null && tNode.parent != null) {
            //left 0  right 1
            if (tNode.parent.leftChild == tNode) {
                stack.push("0");
            } else if (tNode.parent.rightChild == tNode) {
                stack.push("1");
            }
            tNode = tNode.parent;
        }
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    /**
     * 结点
     *
     * @param <T>
     */
    public static class TreeNode<T> implements Comparable<TreeNode<T>> {
        T data;
        int weight;
        TreeNode leftChild;
        TreeNode rightChild;
        TreeNode parent;

        public TreeNode(T data, int weight) {
            this.data = data;
            this.weight = weight;
            leftChild = null;
            rightChild = null;
            parent = null;
        }

        @Override
        public int compareTo(@NonNull TreeNode<T> o) {
            if (this.weight > o.weight) {
                return -1;
            } else if (this.weight < o.weight) {
                return 1;
            }
            return 0;
        }
    }
}
