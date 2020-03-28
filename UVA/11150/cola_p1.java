
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
				
				//羆计-3
				a-=3;
				
				//瞺传瞺
				a++;
				
				//耻瞺计+1(瞺传瞺)
				sum+=1;		
				
				//Τㄢ瞺瞺
				if(a==2){
					a++;
				}
			}
			System.out.println(sum);
		}
	}
}
