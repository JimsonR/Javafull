import java.util.Stack;

public class Stacks {
  protected int a = 10;

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
//        stack.get(0);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}
