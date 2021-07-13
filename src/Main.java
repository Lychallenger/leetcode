
import java.lang.*;
import java.util.*;

//1930. 长度为 3 的不同回文子序列

class Main {
    public int countPalindromicSubsequence(String s) {
        int [] first=new int[26];
        int [] last =new int[26];
        for(int i=0;i<26;i++){
            first[i]=-1;
            last[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            if(first[s.charAt(i)-'a']==-1){
                first[s.charAt(i)-'a']=i;
            }
            else{
                last[s.charAt(i)-'a']=i;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(first[i]!=-1&&last[i]!=-1){
                HashSet<Character> hashSet=new HashSet<>();
                for(int j=first[i]+1;j<last[i];j++){
                    hashSet.add(s.charAt(j));
                }
                count=count+hashSet.size();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="abca";
        int a=s.charAt(1)-'a';
        System.out.println(a);;
    }
}