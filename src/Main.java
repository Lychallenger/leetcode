import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//232. 用栈实现队列

class Main {
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** Initialize your data structure here. */
    public Main() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s2.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return s1.pop();
        }
        else{
            return s1.pop();
        }
    }

    /** Get the front element. */
    public int peek() {
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return s1.peek();
        }
        else{
            return s1.peek();
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}