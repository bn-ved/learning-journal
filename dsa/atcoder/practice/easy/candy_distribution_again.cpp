#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, x;
  cin >> n >> x;

  vector<int> nums(n);
  for (int i = 0; i < n; i++) {
    cin >> nums[i];
  }

  sort(nums.begin(), nums.end());

  int happy = 0;
  for (int i = 0; i < n; i++) {
    if (x >= nums[i]) {
      happy++;
      x -= nums[i];
    }
  }
  if (happy == n && x > 0)
    happy--;
  cout << happy << "\n";
  return 0;
}
