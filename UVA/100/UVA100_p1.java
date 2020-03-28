import java.util.*;
class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int max,len;
		
		while( sc.hasNext() ){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int small=Math.min(a,b);
			int big=Math.max(a,b);
			
			max=0;
			
			for(int i=small;i<=big;i++){
				len=three_plus(i);
				if(len>max){
					max=len;
				}
			}
			
			System.out.println(a+" "+b+" "+max);
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