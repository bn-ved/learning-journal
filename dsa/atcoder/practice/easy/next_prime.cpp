#include <bits/stdc++.h>

using namespace std;

bool isPrime(int x) {
  if (x < 2) {
    return false;
  }
  if (x == 2) {
    return true;
  }
  for (int i = 2; i <= sqrt(x); i++) {
    if (x % i == 0) {
      return false;
    }
  }
  return true;
}

int main() {
  int n;
  cin >> n;

  while (!isPrime(n)) {
    n++;
  }

  cout << n << "\n";
  return 0;
}
