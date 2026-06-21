#include <bits/stdc++.h>

using namespace std;

int main() {
  int n;
  cin >> n;

  vector<int> p(n);
  vector<int> q(n);

  for (int i = 0; i < n; i++) {
    cin >> p[i];
  }
  for (int i = 0; i < n; i++) {
    cin >> q[i];
  }

  if (p > q) {
    swap(p, q);
  }
  int cnt = 0;
  while (p != q) {
    next_permutation(p.begin(), p.end());
    cnt++;
  }
  cout << cnt << "\n";
  return 0;
}
