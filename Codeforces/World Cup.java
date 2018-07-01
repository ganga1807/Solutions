import java.util.Scanner;

public class WorldCup{
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
		    a[i]=scan.nextInt();
		}
		for(int i=0; i<n; i++){
		   a[i]=a[i]-i;
		   if(a[i]<0)a[i]=0;
		}
		for(int i=0; i<n; i++) {
		    if(a[i]%n==0)a[i]=a[i]/n;
		    else a[i]=a[i]/n +1;
		}
		int min=1000000000,f=0;
		for(int i=0; i<n; i++) {
		    if(a[i]<min){
		        min=a[i];
		        f=i+1;
		    }
		}
		
		System.out.println(f);
		
		scan.close();
	}
}