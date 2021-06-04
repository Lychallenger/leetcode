
import java.lang.*;
import java.util.*;

//160. 相交链表

class Main {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        else{
            ListNode tmpA=headA;
            ListNode tmpB=headB;
            while(tmpA!=tmpB){
                tmpA=tmpA.next;
                tmpB=tmpB.next;
                if(tmpA==null&&tmpB==null)break;
                if(tmpA==null){
                    tmpA=headB;
                }
                if(tmpB==null){
                    tmpB=headA;
                }
            }
            if(tmpA==null){
                return null;
            }
            else{
                return tmpA;
            }
        }
    }
}