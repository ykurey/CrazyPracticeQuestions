//UVA100
//CPE10400


 
/*Problem  3N+1 (CPE10400, UVA100)*/
/*��J�@�����n,�p�G n �O�_�� ���� n=3*n+1,�_�h n=n/2,�p���`��,�̫�|�o��1. */
/*�Ҧp��J 10, �o�� 10 5 16 8 4 2 1, cycle-length=7*/
/*���D�y�z�G*/
/*��J 2 �Ӿ��a�Mb,��X����a�Ab�]�]�ta,b)�����Ҧ���ƪ�cycle�Ƥ��̤j�ȡC*/
/*��J0 0�ɡA�����{���C*/

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