package com.solve;

public class ReverseLinkedList {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ListNode l1 = new ListNode();
	//l1.next = new ListNode(2);
	//l1.next.next=new ListNode(3);
	//l1.next.next.next=new ListNode(4);
	//l1.next.next.next.next=new ListNode(5);
	
	ListNode head = reverse(l1 );
	while(head.next!=null) {
	    System.out.println(head.val);
	}
    }

    private static ListNode reverse(ListNode head) {
	// TODO Auto-generated method stub
	ListNode curr = head;
	ListNode prev = null;
	ListNode next=head.next;
	
	while(curr!=null) {
	   next = curr.next;
	   curr.next=prev;
	   prev=curr;
	   curr=next;
	    
	}
	
	return prev;
    }

}
