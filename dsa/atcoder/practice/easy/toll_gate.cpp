#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, m, x;
  cin >> n >> m >> x;

  int a = 0, b = 0;
  for (int i = 0; i < m; i++) {
    int k;
    cin >> k;
    if (k < x) {
      a++;
    } else {
      b++;
    }
  }
  cout << min(a, b) << "\n";
  return 0;
}
