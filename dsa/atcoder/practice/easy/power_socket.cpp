#include <bits/stdc++.h>

using namespace std;

int main() {
  // Optimize IO
  ios::sync_with_stdio(0);
  cin.tie(0);

  int sockets, target, min;

  cin >> sockets >> target;

  // sockets = 1 + n(A + 1)
  // Do a ceiling division (a + b - 1) / b
  min = ((sockets - 1) + (target - 2)) / (sockets - 1);
  cout << min;
  return 0;
}
