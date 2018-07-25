#include<bits/stdc++.h>
using namespace std;
int main(){
	int a[5][5],count=0;
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			cin>>a[i][j];
			if(a[i][j]==1){
				if(i<3)count+=2-i;
				if(i>=3)count+=i-2;
				if(j<3)count+=2-j;
				if(j>=3)count+=j-2;
			}
		}
	}
	cout<<count<<endl;
}