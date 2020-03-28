//UVA100
//CPE10400


 
/*Problem  3N+1 (CPE10400, UVA100)*/
/*輸入一正整數n,如果 n 是奇數 那麼 n=3*n+1,否則 n=n/2,如此循環,最後會得到1. */
/*例如輸入 10, 得到 10 5 16 8 4 2 1, cycle-length=7*/
/*問題描述：*/
/*輸入 2 個整數a和b,算出介於a，b（包含a,b)之間所有整數的cycle數之最大值。*/
/*輸入0 0時，結束程式。*/

import java.util.*;
class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int max,len;
		
		while( sc.hasNext() ){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0 && b==0){
				break;
			}
			max=0;
			for(int i=a;i<=b;i++){
				len=three_plus(i);
				if(len>max){
					max=len;
				}
			}
			System.out.println("Maximum cycle length between "+a+" and "+b+" is "+max);
		}
	}
	public static int three_plus(int j){
		int icy=1;
		while(j!=1){
			if(j%2!=0){
				j=(j*3)+1;
			}else{
				j/=2;
			}
			icy++;
		}
		return icy;
	}
}