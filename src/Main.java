
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//328. 奇偶链表

class Main {

    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode p1=head;
        ListNode p2=head.next;
        ListNode p=head.next.next;
        int ct=1;
        while(p!=null){
            if(ct%2==1){
                p1.next=p;
                p1=p1.next;
            }
            else{
                p2.next=p;
                p2=p2.next;
            }
            p=p.next;
            ct++;
        }
        p1.next=head.next;
        return head;
    }
}