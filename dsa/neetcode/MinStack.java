import java.util.*;

public class MinStack {
    private Deque<int[]> stack;

    public MinStack() {
        this.stack = new ArrayDeque<>();
    }

    public void push(int value) {
        int min = stack.isEmpty() ? value : Math.min(value, stack.peek()[1]);
        stack.push(new int[] { value, min });
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

}
