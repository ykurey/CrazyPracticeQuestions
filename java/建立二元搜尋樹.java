//建立二元搜尋樹

import java.util.*;
public class main{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] data=new int[n];
    	for(int i=0;i<n;i++){
    		data[i]=sc.nextInt();
    	}
    	int MaxNo=1024;
    	
    	int[] btree=new int[MaxNo];
    	for(int i=0;i<MaxNo;i++){
    		btree[i]=0;
    	}
    	
    	btree[1]=data[0];
    	
    	for(int i=1;i<n;i++){
    		int position=1;
    		while(btree[position]!=0){
    			if(data[i]>=btree[position]){
    				position=position*2+1;
    			}else{	
    				position*=2;
    			}
    		}
    		btree[position]=data[i];
    	}
    	int MaxIndex=0;
    	for(int i=MaxNo-1;i>=1;i--){
    		if(btree[i]!=0){
    			MaxIndex=i;
    			break;
    		}
    	}
    	int h=1;
    	int no=1;
    	int total=1;
    	
    	while(total<MaxIndex){
    		no*=2;
    		total+=no;
    		h++;
    	}
    	System.out.printf("%d\n",h);
    	int tno=1;
    	for(int i=0;i<h;i++){
    		tno*=2;
    	}
    	for(int i=0;i<tno;i++){
    		System.out.printf("%d ",btree[i]);
    	}
    }
}

