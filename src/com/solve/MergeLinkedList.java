package com.solve;

public class MergeLinkedList {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ListNode l1 = new ListNode(1);
	l1.next = new ListNode(2);
	l1.next.next=new ListNode(4);
	
	ListNode l2 = new ListNode(5);
	//l2.next = new ListNode(3);
	//l2.next.next=new ListNode(4);
	
	ListNode output = Merge(l1,l2);
	while(output!=null) {
	    System.out.println(output.val);
	    output = output.next;
	}
	
    }

    private static ListNode Merge(ListNode l1, ListNode l2) {
	// TODO Auto-generated method stub
	ListNode res = null;
	ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
	if(l1 == null) return l2;
	if(l2 == null) return l1;
	if(l1== null && l2 == null) return null;
	/*if(l1.val <= l2.val) {
	    res = new ListNode(l1.val);
	    res.next = new ListNode(l2.val);
	}else
	{
	    res = new ListNode(l2.val);
	    res.next = new ListNode(l1.val);
	}*/
	while(l1 != null && l2 !=null) {
	    
	    	if(l1.val <l2.val) {
	    	    		cur.next = l1;
	    	    		l1 = l1.next;
	    	}
	    	else {
	    	    		cur.next=l2;
	    	    		l2=l2.next;
	    	}
	    	cur = cur.next;
	    	
	}
	if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return dummy.next;
    }

    private static ListNode traverseAndAddToLinkedList(ListNode res, int l1, int l2) {
	// TODO Auto-generated method stub
	ListNode temp = res;
	if(res == null) {
	    if(l1 <= l2) {
		    res = new ListNode(l1);
		    res.next = new ListNode(l2);
		}else
		{
		    res = new ListNode(l2);
		    res.next = new ListNode(l1);
		}
	}
	else {
	    while(temp.next!=null) {
		temp = temp.next;
	    }
	    temp.next = new ListNode(l1);
	    temp.next.next = new ListNode(l2);
	}
	return res;
	
	
    }

    private static void traverseAndAddToLinkedList(ListNode res) {
	// TODO Auto-generated method stub
	
    }

}

