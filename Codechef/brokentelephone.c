#include <stdio.h>

int main(void) 
{
    int t,i,n,c;
    
    scanf("%d",&t);
    while(t--)
    {
        c=0;
        scanf("%d",&n);
        int a[n];
        for(i=0;i<n;i++)
        scanf("%d",&a[i]);
        for(i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
            if(a[i]==a[i-1]&&i!=0)
            c=c+2;
            else if(i==0)
            c=c+2;
            else 
            c=c+1;
            }
        }
         printf("%d\n",c);
        
    }
	return 0;
}
