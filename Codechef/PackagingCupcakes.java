import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class PackagingCupcakes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int t;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t>0){
            int n;
            scan.nextLine();
            n=scan.nextInt();
            n=n/2;
            System.out.println(n+1);
            t--;
        }
            scan.close();
        
    }
}
 