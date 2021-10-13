package com.solve;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MergeBinaryTrees {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	TreeNode tree1 = new TreeNode(1);
	tree1.left = new TreeNode(3);
	tree1.right = new TreeNode(2);
	tree1.left.left=new TreeNode(5);
	
	TreeNode tree2 = new TreeNode(2);
	tree2.left = new TreeNode(1);
	tree2.right = new TreeNode(3);
	tree2.left.right = new TreeNode(4);
	tree2.right.left = new TreeNode(7);
	
	TreeNode root = MergeTrees(tree1,tree2);
	
	InOrderTraversal(root);
	
    }

    private static void InOrderTraversal(TreeNode root) {
	// TODO Auto-generated method stub
	
	while(root!=null) {
	    InOrderTraversal(root.left);
	    System.out.println(root.val);
	    InOrderTraversal(root.right);
	}
	
    }

    private static TreeNode MergeTrees(TreeNode tree1, TreeNode tree2) {
	
	if(tree1==null) return tree2;
	if(tree2==null) return tree1;
	
	return new TreeNode(tree1.val+tree2.val,MergeTrees(tree1.left,tree2.left),MergeTrees(tree1.right,tree2.right));
	
    }

    private static TreeNode BuildTreefromQ(Queue<Integer> resTreeQ) {
	// TODO Auto-generated method stub
	TreeNode resTree = new TreeNode(resTreeQ.poll());
	while(!resTreeQ.isEmpty()) {
	    if(resTree.left == null) resTreeQ.poll();
	    else if(resTree.right == null) resTreeQ.poll();
	}
	
	return resTree;
    }

}

class TreeNode {
         int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
            this.left = left;
             this.right = right;
        }
    }
