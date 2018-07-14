import java.util.Scanner;

public class DeleteFromLeft{
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		String a,b;
		a=scan.nextLine();
		b=scan.nextLine();
		int ans=a.length()+b.length();
		char[] aa=a.toCharArray();
		char[] bb=b.toCharArray();
		for(int i=a.length()-1,j=b.length()-1;j>=0&&i>=0;j--,i--){
			if(aa[i]==bb[j])ans+ans-2;
			else break;
		}
		System.out.println(ans);
		


	}
}