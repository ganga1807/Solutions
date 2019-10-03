intest q1
codechef

#include<stdio.h>
int main(){
    int n,k,a,c=0;
    scanf("%d%d",&n,&k);
    while(--n)
    {  scanf("%d",&a);
        if(a%k==0)
        c++;
    }
    printf("%d",c);
    return 0;
}