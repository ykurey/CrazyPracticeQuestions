import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int a=sc.nextInt();
			
			//���x�s�ܤF�X�~
			int sum=a;
			
			//�u����~�A�i�A�ɤ@�~�A����@�~�ܧ��A��n�٦^�h
			if(a==2){
				a++;
			}
			
			//�T�Ų~���@�~
			while(a>=3){
				
				//�w�ܲ~��+���o���~��(���� -> �w��)
				sum=sum+a/3;
				
				//�T�~���@�~(7/3=2���o��~)+���������@�~���~��
				a=a/3+a%3;
				
				
				//�u����~�A�i�A�ɤ@�~
				if(a==2){
					a++;
				}
			}
			System.out.println(sum);
		}
	}
}
