import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int a=sc.nextInt();
			
			//纗耻碭瞺
			int sum=a;
			
			//Τㄢ瞺瞺传瞺耻Ч临
			if(a==2){
				a++;
			}
			
			//瞺传瞺
			while(a>=3){
				
				//耻瞺计+传眔瞺计(ゼ耻 -> 耻)
				sum=sum+a/3;
				
				//瞺传瞺(7/3=2传眔ㄢ瞺)+ぃ镑传Θ瞺瞺计
				a=a/3+a%3;
				
				
				//Τㄢ瞺瞺
				if(a==2){
					a++;
				}
			}
			System.out.println(sum);
		}
	}
}
