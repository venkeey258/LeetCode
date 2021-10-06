package com.solve;

public class NthNodeRemoval {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ListNode node1 = new ListNode(1,null);
   	 ListNode node2 = new ListNode(2,null);
   	 //ListNode node3 = new ListNode(3,null);
   	// ListNode node4 = new ListNode(4,null);
   	// ListNode node5 = new ListNode(5,null);
   	node1.next = node2;
    	//node2.next=node3;
    	//node3.next=node4;
    	//node4.next=node5;
    	int n = 2;
    	ListNode res = removeNthNode(node1,n);
    	System.out.println(res.val);

    }

    private static ListNode removeNthNode(ListNode head,int n) {
	// TODO Auto-generated method stub
	ListNode fast = head;
	ListNode curr = head;
	ListNode slow = head;
	int cnt = 1;
	
	while(curr.next != null) {
	    cnt++;
	    curr = curr.next;
	}
	if(cnt == 1) {
	    head.next= null;
	}
	
	
	for(int i=1;i<(cnt-n);i++) {
	    slow = fast;
	    fast = fast.next;
	}
	slow.next = fast.next;
	
	return head;
	
    }

}


