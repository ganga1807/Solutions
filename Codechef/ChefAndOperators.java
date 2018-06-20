import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class ChefAndOperators
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int t;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t>0){
            int a,b;
            scan.nextLine();
            a=scan.nextInt();
            b=scan.nextInt();
            if(a>b)
            {System.out.println(">");}
            else if(a<b)
            {
               System.out.println("<"); 
            }
            else System.out.println("=");
            t--;
        }
            scan.close();
        
    }
}
 