#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,m;
	cin>>n>>m;
	int c[n],a[m];
	for(int i=0;i<n;i++){
		cin>>c[i];
	}
	for(int j=0;j<m;j++){
		cin>>a[j];
	}
	int count=0;
	for(int i=0,j=0;i<n&&j<m;i++){
		if(c[i]<=a[j]){
			j++;count++;
		}
	}

	cout<<count;
	return 0;
}