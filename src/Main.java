
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//1678. 设计 Goal 解析器



class Main {
    public String interpret(String command) {
        StringBuffer sb=new StringBuffer();
        int i=0;
        while(i<command.length()){
            char c=command.charAt(i);
            if(c=='G'){
                sb.append('G');
                i=i+1;
            }
            else{
                if(command.charAt(i+1)==')'){
                    sb.append('o');
                    i=i+2;
                }
                else{
                    sb.append("al");
                    i=i+4;
                }
            }
        }
        return sb.toString();
    }
}