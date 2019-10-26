import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class ChefAndOperators
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int test;
        Scanner scan=new Scanner(System.in);
        test=scan.nextInt();
        while(test>0){
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
            test--;
        }
            scan.close();
        
    }
}
 