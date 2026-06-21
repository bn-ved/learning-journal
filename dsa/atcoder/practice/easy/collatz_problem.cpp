#include <bits/stdc++.h>

using namespace std;

int main() {
  set<int> numSet;

  int n;
  cin >> n;

  int count = 1;
  while (numSet.find(n) == numSet.end()) {
    numSet.insert(n);
    if (n % 2 == 0) {
      n /= 2;
    } else {
      n = (3 * n) + 1;
    }
    count++;
  }

  cout << count << "\n";
  return 0;
}
