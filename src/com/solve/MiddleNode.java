package com.solve;



class ListNode {
    
    	int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

public class MiddleNode {
    	 
    	
       public static void main(String[] args) {
	   
	   ListNode node1 = new ListNode(1,null);
	    	 ListNode node2 = new ListNode(2,null);
	    	 ListNode node3 = new ListNode(3,null);
	    	 ListNode node4 = new ListNode(4,null);
	    	 ListNode node5 = new ListNode(5,null);
	    	ListNode node6 = new ListNode(6,null);
	    	node1.next = node2;
	    	node2.next=node3;
	    	node3.next=node4;
	    	node4.next=node5;
	    	node5.next=node6;
	    	
	    	calcMid(node1);
	
    }

    private static void calcMid(ListNode head) {
	// TODO Auto-generated method stub
	ListNode slow = head;
	ListNode curr = head;
	
	while(curr!=null && slow!=null && curr.next!=null)
	{
	    curr = curr.next.next;
	    	
	    if(curr !=null) slow = slow.next;
	    else slow = slow.next;
	}
	System.out.println(slow.val);
    }
    	
    	 
    	 
    	
    
}
