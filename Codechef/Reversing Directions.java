import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            int n = scan.nextInt();
            scan.nextLine();
            String ln[]= new String[n];
            for(int i=0;i<n;i++){
		        ln[i]=scan.nextLine();}
                 System.out.println("Begin"+ (ln[n-1].substring(ln[n-1].indexOf(" "))));
            for(int j=n-1;j>0;j--){
                if(ln[j].startsWith("Right")){
                    System.out.println("Left"+ (ln[j-1].substring(ln[j-1].indexOf(" "))));}
                else{
                    System.out.println("Right"+ (ln[j-1].substring(ln[j-1].indexOf(" "))));}
            }
            System.out.println();
            t--;
        }
        scan.close();
	}
}
