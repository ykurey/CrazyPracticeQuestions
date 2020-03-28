//絕對值的最大乘積

import java.util.*;
class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float[] arr=new float[5];
		float max=0;
		for(int i=0;i<5;i++){
			arr[i]=Math.abs(sc.nextFloat());
		}
		
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(max<arr[i]*arr[j]){
					max=arr[i]*arr[j];
				}
			}
		}
		System.out.println(max);
	}
}
