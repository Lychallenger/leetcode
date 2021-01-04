import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//509. 斐波那契数



class Main {

    public int fib(int n) {
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}