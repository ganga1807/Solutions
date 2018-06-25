import java.util.*;
public class Watermelon
{
	public static void main (String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n;
        n=scan.nextInt();
        if(n%2==0&&n>2)System.out.println("YES");
        if(n<=2||n%2!=0)System.out.println("NO");
        scan.close();

	}
}
