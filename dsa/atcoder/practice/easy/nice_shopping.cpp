#include <bits/stdc++.h>

using namespace std;

int main() {
  int a, b, m;
  cin >> a >> b >> m;

  vector<int> refrigerator(a);
  vector<int> microwave(b);

  for (int i = 0; i < a; i++) {
    cin >> refrigerator[i];
  }
  for (int i = 0; i < b; i++) {
    cin >> microwave[i];
  }

  int mini = INT_MAX;
  for (int i = 0; i < m; i++) {
    int pr, pm, d;
    cin >> pr >> pm >> d;

    mini = min(mini, (refrigerator[pr - 1] + microwave[pm - 1]) - d);
  }

  // Check whether we really need to use the coupon or not.
  sort(refrigerator.begin(), refrigerator.end());
  sort(microwave.begin(), microwave.end());
  mini = min(mini, refrigerator[0] + microwave[0]);

  cout << mini << "\n";

  return 0;
}
