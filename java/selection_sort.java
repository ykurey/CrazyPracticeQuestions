//選擇排序法

import java.util.*;
public class main {        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
        	arr[i]=sc.nextInt();
        }
        SelectSort(arr);
        print(arr);
        
    }
    public static int[] swap(int[] a,int i,int j){
    int tmp=a[i];
    	a[i]=a[j];
    	a[j]=tmp;
    	return a;
    }
    public static void SelectSort(int[] a) {
    	int min=0;
    	for(int i=0;i<a.length-1;i++){
    		for(int j=i;j<a.length;j++){
    			if(a[j]<a[min]){
    				min=j;//找到最小值跟第一個交換 標籤標目前最小值(min)
    			}
    		}
    	swap(a,i,min);
    	}
    }
    public static void print(int[] a) {
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}


