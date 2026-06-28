void main() {

}

public int operate(int a, int b, String sign) {
    if (sign.equals("+")) {
        return b + a;
    }
    if (sign.equals("-")) {
        return b - a;
    }
    if (sign.equals("/")) {
        return b / a;
    }
    return b * a;
}

public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    String signs = "+-*/";

    for (String token : tokens) {
        if (!signs.contains(token)) {
            stack.push(Integer.parseInt(token));
        } else if (!stack.isEmpty() && stack.size() >= 2) {
            int a = stack.pop();
            int b = stack.pop();
            int newVal = operate(a, b, token);
            stack.push(newVal);
        }
    }
    return stack.pop();
}
