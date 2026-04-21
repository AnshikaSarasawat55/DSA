import java.util.concurrent.Callable;

public class MainStack {
    public static void main(String[] args) throws Exception {
     CustomStack stack=new CustomStack(5);
     stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
