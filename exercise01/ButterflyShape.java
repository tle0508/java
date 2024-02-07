package exercise01;

import java.util.Stack;

public class ButterflyShape {
    private int num;

    public ButterflyShape(int num) {
        this.num = num;
    }

    public void printButterfly() {
        Stack<String> stack = new Stack<String>();


        for (int i = 1; i < num; i++) {
            String stars1 = "+ ".repeat(i);
            String spaces1 = "  ".repeat(num - i);
            String middle =  "  ";
            String spaces2 = "  ".repeat(num - i);
            String stars2 = "+ ".repeat(i);
            stack.push(stars1 +middle + spaces1 + spaces2 + stars2);
        }


        for (int i = 1; i <= num; i++) {
            String stars1 = "+ ".repeat(num - i + 1);
            String middle;
            if(i == 1){
                middle="- ";
            }else{
                middle="  ";
            }
            String spaces1 = "  ".repeat(i - 1);
            String spaces2 = "  ".repeat(i - 1);
            String stars2 = "+ ".repeat(num - i + 1);
            stack.push(stars1 + middle + spaces1 + spaces2 + stars2);
        }


        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
