//插入排序法

import java.util.*;
public class main {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		InsertSort(arr);
		print(arr);
    }
    
    public static void InsertSort(int[] a) {
  		int n,j;
  		for(int i=1;i<a.length;i++){
  			n=a[i];
  			j=i-1;
  			while(j>=0 && a[j]>n){
  				a[j+1]=a[j];
  				j--;
  			}
  			a[j+1]=n;
  		}
    }
    public static void print(int[] a) {
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}


