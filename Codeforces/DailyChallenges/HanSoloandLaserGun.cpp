#include<bits/stdc++.h>
using namespace std;
int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int n,x,y,a,b;
	set<int> s;
	cin>>n>>x>>y;
	while(n--){
		cin>>a>>b;
		if(x==a)s.insert(INT_MAX);
		else s.insert((b-y)/(a-x));
	}
	cout<<s.size()<<endl;
	return 0;
}
