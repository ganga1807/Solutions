import java.util.Scanner;

public class TanyaAndStairways{
	
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int n;
	n=scan.nextInt();
	int[] a=new int[n+1];
	int[] b=new int[n];
	for(int i=0;i<n;i++){
		a[i]=scan.nextInt();
	}
	a[n]=0;
	int t=1,c=0;
	for(int i=0;i<n;i++){
		if(a[i+1]<=a[i]){b[c++]=t;t=1;}
		else{
			t++;
		}
	}
	System.out.println(c);
	for(int i=0;i<c;i++){
		System.out.print(b[i]+" ");
	}




}

}