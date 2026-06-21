#include <bits/stdc++.h>

using namespace std;

int main() {
  // Faster IO
  ios::sync_with_stdio(0);
  cin.tie(0);

  int mini = INT_MAX;

  int n;
  cin >> n;

  int pos[n];
  for (int i = 0; i < n; i++) {
    cin >> pos[i];
  }

  int p = min(100, n);
  for (int i = 1; i < p; i++) {
    int total = 0;
    for (int j = 0; j < n; j++) {
      total += (pos[i] - i) * (pos[i] - i);
      cout << total << "\n";
    }
    mini = min(mini, total);
  }
  cout << mini;
  return 0;
}
