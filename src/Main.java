
import java.lang.*;
import java.util.*;

//148. 排序链表


class Main {

    public ListNode sortList(ListNode head) {
        if(head==null)return head;
        ListNode ordered=new ListNode(-1);
        while(head!=null){
            ListNode tmp=ordered;
            ListNode now=ordered.next;
            while (now!=null&&head.val>now.val){
                now=now.next;
                tmp=tmp.next;
            }
            tmp.next=head;
            head=head.next;
            tmp.next.next=now;
        }
        return ordered.next;
    }

}