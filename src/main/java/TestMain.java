/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class TestMain {
    public static void main (String[] args) throws Exception {
        //code
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase=1;
        TestMain gfg= new TestMain();
        while(testCase>0){
            gfg.permute("ABCDEF",0,2);
            testCase--;
        }
    }

    public void permute(String str, int start, int end){
        char a[]=str.toCharArray();
        if(start==end){
            System.out.println(str);
        }
        else{
            for(int i=start;i<=end;i++){
                str=swapLetters(str,start,i);
                permute(str,start+1,end);
                str=swapLetters(str,start,i);
            }
        }

    }

    public String swapLetters(String str, int s, int e){
        char a[] = str.toCharArray();
        char temp;
        temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        return String.valueOf(a);
    }
}