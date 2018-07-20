#include<bits/stdc++.h>
using namespace std;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	long long n;
	cin>>n;
	long long a[n];
	for(long long i=0;i<n;i++){
		cin>>a[i];
	}
	long long i=0,j=n-1,max=0,sum1=0,sum2=0;
	while(i<=j){
		sum1+=a[i++];
		if(sum1==sum2){
			if(sum1>max)max=sum1;
		}
		while(sum1>sum2&&i<=j){
			sum2+=a[j--];
		}
		if(sum1==sum2){
			if(sum1>max)max=sum1;
		}
		
	}
	cout<<max<<endl;
	




	return 0;
}