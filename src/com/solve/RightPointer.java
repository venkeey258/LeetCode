package com.solve;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class RightPointer {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node node = new Node(1);
	node.left = new Node(2);
	node.right = new Node(3);
	node.left.left = new Node(4);
	node.left.right = new Node(5);
	node.right.left=new Node(6);
	node.right.right=new Node(7);
	
	//InOrderTraversal(node);
	Node output = connect(node);
	

    }

    private static Node connect(Node node) {
	// TODO Auto-generated method stub
	Deque<Node> myQ = new ArrayDeque<Node>();
	myQ.add(node);
	//node.next=null;
	while(!myQ.isEmpty()) {
	    
	    int size = myQ.size();
	    for(int i =0;i<size;i++) {
		Node newnode = myQ.poll();
		if(i==size-1) newnode.next=null;
		else newnode.next = myQ.peek();
		
		if(newnode.left!=null) myQ.add(newnode.left);
		if(newnode.right!=null) myQ.add(newnode.right);
	    }
	}
        return node;
    }

    private static void InOrderTraversal(Node node) {
	// TODO Auto-generated method stub
	if(node != null) {
	 InOrderTraversal(node.left);
	 System.out.println(node.val);
	 InOrderTraversal(node.right);
	}
	
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
