//二元樹的拜訪

import java.util.*;
public class main{
	static int n;
    static int[] btree;
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
    	btree=new int[n];
    	for(int i=0;i<n;i++){
    		btree[i]=sc.nextInt();
    	}
    	pre(1);
    	System.out.println();
    	in(1);
    	System.out.println();
    	post(1);
    }
    public static void pre(int node){
    	if(node!=0){
    		System.out.printf("%d ",btree[node]);
    	}
    	if(node<n/2){
    		if(btree[2*node]!=0){
    			pre(2*node);
    		}
    		if(btree[2*node+1]!=0){
    			pre(2*node+1);
    		}
    	}
    }
    public static void in(int node){
    	if(node<n/2){
    		if(btree[node*2]!=0)
    			in(2*node);
    	}
    	if(btree[node]!=0){
    		System.out.printf("%d ",btree[node]);
    	}
    	if(node<n/2){
    		if(btree[node*2+1]!=0)
    			in(2*node+1);
    	}
    }
    public static void post(int node){
    	if(node<n/2){
    		if(btree[node*2]!=0)
    			post(2*node);
    		if(btree[node*2+1]!=0)
    			post(2*node+1);
    	}
    	if(btree[node]!=0){
    		System.out.printf("%d ",btree[node]);
    	}
    }
}

