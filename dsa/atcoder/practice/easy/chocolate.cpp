#include <bits/stdc++.h>

using namespace std;

int eaten(int x, int d) {
  int count = 0;
  for (int i = 0; i < d; i++) {
    if ((x * i) + 1 <= d)
      count++;
  }
  return count;
}
int main() {
  int n, d, x;
  cin >> n >> d >> x;

  int total = x;
  for (int i = 0; i < n; i++) {
    int a;
    cin >> a;
    total += eaten(a, d);
  }
  cout << total << "\n";
  return 0;
}
