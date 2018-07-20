#include<bits/stdc++.h>
using namespace std;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	long long n,k;
	cin>>n>>k;
	long long a[n],b[n];
	for(long long i=0;i<n;i++){
		cin>>a[i];b[i]=a[i];
	}
	sort(b,b+n);
	int p[n];
	int j=0,i=n-1;
	while(k--){
		p[j++]=b[i--];
	}
	/*for(int i=0;i<j;i++)cout<<p[i];
		cout<<endl;*/
	int g=0,pos[j];
	for(int i=0;i<j;i++){
		for(int t=0;t<n;t++){
			if(a[t]==p[i]){
				pos[g++]=t;
				a[t]=0;
				break;
			}
		}
	}
	int sum=0;
	sort(pos,pos+j);
	for(int i=0;i<j;i++){
		sum+=p[i];
	}
	cout<<sum<<endl;
	g=-1;
	for(int i=0;i<j-1;i++){
		cout<<pos[i]-g<<" ";
		g=pos[i];
	}
	cout<<n-1-g<<" ";
	
	




	return 0;
}