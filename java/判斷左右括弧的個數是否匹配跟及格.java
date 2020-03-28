//判斷左右括弧的個數是否匹配跟及格

import java.util.*;
class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Stack<Integer> st=new Stack<Integer>();
		boolean t=true;
		char[] a=sc.next().toCharArray();
		int i=0;
		while(i<a.length){
			if(a[i]=='('){
				st.push(1);
			}
			if(a[i]==')'){
				if(st.empty()){
					st.push(-1);
					break;
				}else{
					if(st.peek()==1){
						st.pop();
					}else{
						st.push(-1);
					}
				}
			}
			
			i++;
		}
		if(st.empty()){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}


