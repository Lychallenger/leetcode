import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//86. 分隔链表



class Main {

    public ListNode partition(ListNode head, int x) {
            ListNode p1=new ListNode(-1);
            ListNode p2=p1;
            p1.next=head;
            ListNode pre=p1;
            while(head!=null&&head.val<x){
                p1=p1.next;
                head=head.next;
                pre=pre.next;
            }
            while (head!=null){
                if(head.val<x){
                    ListNode t1=head;
                    ListNode tmp=head.next;
                    t1.next=p1.next;
                    p1.next=t1;
                    p1=p1.next;
                    head=tmp;
                    pre.next=tmp;
                }
                else{
                    pre=head;
                    head=head.next;
                }
            }
            return p2.next;
    }
}