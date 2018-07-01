import java.util.Scanner;

public class ReversingEncryption{
	public static void main (String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String t=scan.nextLine();
		String reverse="";
		for(int i=2; i<=n; i++){
		    if(n%i== 0){
		        for(int j=i-1; j>=0; j--){
		            reverse+=t.charAt(j);
		        }
		        for(int j=i; j<n; j++) {
		            reverse+=t.charAt(j);
		        }
		        t=reverse;
		        reverse="";
		    }
		}
		System.out.println(t);
		scan.close();
	}
}