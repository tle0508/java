package exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ButterflyShape implements Shape {
    private final int num;

    public ButterflyShape(int num) {
        this.num = num;
    }
    @Override
    public List<String> printshape() {
        Stack<String> stack = new Stack<String>();
        List<String> result = new ArrayList<>();
        //บน
        for (int i = 1; i < num; i++) {
            String star = STAR.repeat(i);
            String space = SPACE.repeat(((2*num)-(2*i))+1);
            result.add(stack.push(star + space + star ));
        }
        //กลาง
        result.add(STAR.repeat(num) + "-" +STAR.repeat(num));
        //ล่าง
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
