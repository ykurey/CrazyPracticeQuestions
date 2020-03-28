//前序四則運算

/*
 
 輸入範例 : + 1 - * 2 3 4
 中序 : 1 + 2 * 3 - 4
 前序 : + 1 - * 2 3 4
 
 **/

import java.util.*;
public class main {
   public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	Stack <String> st=new Stack<String>();
    	String[] strr=sc.nextLine().split(" ");
    	int i=strr.length-1;
    	int a,b;
    	while(i>=0){
    		st.push(strr[i]);
    		switch(st.peek()){
    			case "+":
    				st.pop();
    				a=Integer.parseInt(st.pop());
    				b=Integer.parseInt(st.pop());
    				st.push(String.valueOf(a+b));
    				break;
    			case "-":
    				st.pop();
    				a=Integer.parseInt(st.pop());
    				b=Integer.parseInt(st.pop());
    				st.push(String.valueOf(a-b));
    				break;
    			case "*":
    				st.pop();
    				a=Integer.parseInt(st.pop());
    				b=Integer.parseInt(st.pop());
    				st.push(String.valueOf(a*b));
    				break;
    			case "/":
    				st.pop();
    				a=Integer.parseInt(st.pop());
    				b=Integer.parseInt(st.pop());
    				st.push(String.valueOf(a/b));
    				break;
    		}
    		i--;
    	}
    	System.out.println(st.pop());
   }
}


