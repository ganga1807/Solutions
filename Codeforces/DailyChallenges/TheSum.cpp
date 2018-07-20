#include<bits/stdc++.h>
using namespace std;
int fib(int n)
{
	if(n==1)return 1;
	else if(n==0)return 0;
	else return fib(n-1)+fib(n-2);
}
int main(){
	int a=1,b=1,t,sum=0;
	int n;
	cin>>n;
	for(int i=1;i<=n;i++)
	{
		if(i==1)sum+=1;
		else if(i==2)sum+=1;
		else
		{t=a+b;
		a=b;
		b=t;
		sum+=t;}

	}
	cout<<sum<<endl;
	return 0;
}