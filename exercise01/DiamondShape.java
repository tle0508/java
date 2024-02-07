package exercise01;

import java.util.Stack;

public class DiamondShape {
    private int num;
    private final String SPACE = "  ";
    private final String STAR = "+ ";
    public DiamondShape(int num) {
        this.num = num;
    }
    public void printDiamond() {
        Stack<String> stack = new Stack<String>();
        int mid = num / 2;

        for (int i = 0; i <= mid; i++) {
            String spaces =SPACE.repeat(mid - i);
            String stars = STAR.repeat(2 * i + 1);
            stack.push(spaces + stars);
        }

        for (int i = mid - 1; i >= 0; i--){
            String spaces =SPACE.repeat(mid - i);
            String stars = STAR.repeat(2 * i + 1);
            stack.push(spaces + stars);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
