import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int c=0,m=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n>0){

            if(n%2==1){

                c=c+1;
            }
            else{
                if(m<=c)m=c;
                c=0;
            }
            n=n/2;
        
        }
        if(m<=c)m=c;
    System.out.println(m);
        scanner.close();
    }
}
