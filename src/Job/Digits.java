package Job;

import java.util.Stack;

public class Digits {
    public static void main(String[] args) {
        int number = 8765;

        Stack<Integer> stack = new Stack<Integer>();

        int result = 0;
        while (number != 0) {
            result = number % 10;
            stack.push(result);
            number /= 10;
        }

        int res = 0;
        for (int i = stack.size() - 1; i >= 0; i--) {

            res += stack.get(i) * Math.pow(10, i);
        }

        System.out.println(res);
    }
}
