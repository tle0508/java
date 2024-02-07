package exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DiamondShape implements Shape  {
    private final int num;
    public DiamondShape(int num) {
        this.num = num;
    }
    @Override
    public List<String> printshape() {
        Stack<String> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        int mid = num / 2;
        //ข้างบน
        for (int i = 0; i < mid; i++) {
            String space = SPACE.repeat(mid - i);
            String star = STAR.repeat(2 * i + 1);
            result.add(stack.push(space + star));
        }
        //กลาง
        result.add(STAR.repeat(num));
        //ล่าง
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }

}
