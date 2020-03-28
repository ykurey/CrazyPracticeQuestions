//二元節點分析

import java.util.*;
class main{
	static int n;
	static int[] btree;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		btree=new int[n];
		for(int i=0;i<n;i++){
			btree[i]=sc.nextInt();
		}
		int totalnode=0;
		for(int i=1;i<n;i++){
			if(btree[i]!=0){
				totalnode++;
			}
		}
		int leafnode=0;
		int insidenode=0;
		for(int i=1;i<n;i++){
			if(btree[i]!=0){
				int value=isleaf(i);
				if(value==1){
					insidenode++;
				}else if(value==0){
					leafnode++;
				}
			}
		}
		System.out.print(insidenode+"\n");
		System.out.print(leafnode);
	}
	public static int isleaf(int no){
		if(no<n/2){
			if(btree[no*2+1]!=0 || btree[no*2]!=0){
				return 1;
			}else{
				return 0;
			}
		}else{
			return 0;
		}
	}
}
