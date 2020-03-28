//Max Heap

import java.util.*;
public class main{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int MaxNo=16;
    	int n=sc.nextInt();
    	int h=1;
    	int[] data=new int[n];
    	for(int i=0;i<n;i++){
    		data[i]=sc.nextInt();
    	}
    	if(n==1) h=1;
    	if((n>=2) && (n<=3)) h=2;
    	if((n>=4) && (n<=7)) h=3;
    	if((n>=8) && (n<=15)) h=4;
    	
    	int tno=1;
    	
    	for(int i=1;i<=h;i++){
    		tno=tno*2;
    	}
    	int[] MaxHeap=new int[MaxNo];
    	for(int i=0;i<MaxNo;i++){
    		MaxHeap[i]=0;
    	}
    	int size=0;
    	int position=0;
    	
    	for(int i=0;i<n;i++){
    		position=++size;
    		MaxHeap[position]=data[i];	
    		while(position>1){
    			int parent=position/2;
    			if(MaxHeap[position]>MaxHeap[parent]){
    				int tmp=MaxHeap[position];
    				MaxHeap[position]=MaxHeap[parent];
    				MaxHeap[parent]=tmp;
    			}
    			position=parent;
    		}	
    	}
    	System.out.printf("%d\n",h);
    	for(int i=0;i<tno;i++){
    		System.out.printf("%d ",MaxHeap[i]);
    	}
    }
}


