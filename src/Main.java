import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//82. 删除排序链表中的重复元素 II

class Main {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ret=new ListNode(-1);
        ListNode result=ret;
        if(head==null){
            return null;
        }
        ret.next=head;
        while(head.next!=null){
            if(head.val==head.next.val){
                ret.next=null;
            }
            else{
                if(ret.next!=null){
                    ret=ret.next;
                }
                ret.next=head.next;
            }
            head=head.next;
        }
        return result.next;
    }
}