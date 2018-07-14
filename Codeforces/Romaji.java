import java.util.Scanner;

public class B{
	
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	String a,b;
	a=scan.nextLine();
	b=scan.nextLine();
	char[] aa=a.toChar();
	char[] bb=b.toChar();

	int l,ans,j;
	if(a.length()<b.length()){l=a.length()-1;j=b.length()-1;}
	ans=l+j+2;
	for(int i=l;i>=0;i--){
		if (aa[j]==bb[i]){
			ans=ans-2;
		}
		else break;

	}
	System.out.println(ans);




}

}