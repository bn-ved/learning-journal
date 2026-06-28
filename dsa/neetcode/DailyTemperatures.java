void main() {

}

public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> temps = new Stack<>();

    int n = temperatures.length;
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
        while (!temps.isEmpty() && temperatures[temps.peek()] < temperatures[i]) {
            int prev = temps.pop();
            ans[prev] = i - prev;
        }
        temps.add(i);
    }
    return ans;
}
