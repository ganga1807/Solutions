import java.util.*;
import java.lang.*;
import java.io.*;


public class Day11
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int[][] a=new int[6][6];
		for(int i=0;i<6;i++){
		    for(int j=0;j<6;j++){
		        a[i][j]=scan.nextInt();
		    }
		}
		int max=0,sum=0;
		for(int i=0;i<=3;i++){
		    for(int j=0;j<=3;j++){
		        sum=0;
		        for(int p=i;p<i+3;p++){
		            for(int q=j;q<j+3;q++){
		                if(p==i||p==i+2){
		                    sum=sum+a[p][q];
		                }
		                else if(p==i+1&&q==j+1)sum=sum+a[p][q];
		                
		            }
		        }
		        if(sum>max){
		            max=sum;
		        }
		    }
		}
		System.out.println(max);
		
	}
}
