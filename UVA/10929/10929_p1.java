import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
				
		while(sc.hasNext()){
			String a=sc.next();
			int sum=0;
			
			//0ぃ璸衡
			if(a.equals("0")){
				break;
			}else{
			
				//ノㄓ北搭(计+,案计-)
				int evenodd=1;
				
				//眖材计秨﹍
				for(int i=0;i<a.length();i++){
				
					//羆㎝+じ锣计*(1┪-1)
					//じ锣计 -> じ-48┪-'0'
					sum+=(a.charAt(i)-48)*evenodd;
					
					//跑传搭
					evenodd*=-1;	
				}
			}
			
			if(sum%11==0){
				System.out.println(a+" is a multiple of 11.");
			}else{
				System.out.println(a+" is not a multiple of 11.");
			}
				
		}
	}
}