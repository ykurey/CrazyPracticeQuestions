import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
				
		while(sc.hasNext()){
			String a=sc.next();
			int sum=0;
			
			//0���p��
			if(a.equals("0")){
				break;
			}else{
			
				//�Ψӱ���[��(�_��+,����-)
				int evenodd=1;
				
				//�q�Ĥ@�Ӽƶ}�l
				for(int i=0;i<a.length();i++){
				
					//�`�M+�r����Ʀr*(1��-1)
					//�r����Ʀr -> �r��-48��-'0'
					sum+=(a.charAt(i)-48)*evenodd;
					
					//�ܴ��[��
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