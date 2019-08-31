import java.util.Scanner;
import java.util.Stack;
import java.io.*;

public class Q23 {
    Stack<Integer> stack=new Stack<>();
    void push()
    {int i;
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the element in stack");
        i=ob.nextInt();
        stack.push(i);
    }
    void pop()
    {int j;
        if(stack.empty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            j=stack.pop();
            System.out.println("Element popped out is "+j);}
    }
    void top()
    {
        System.out.println("The top element of stack is "+stack.peek());
    }

    public static void main(String[] args) {
        Q23 obj=new Q23();
        int y;
        Scanner ob=new Scanner(System.in);
        label:
        while(true)
        {
            System.out.println("Enter the operation you want to perform");
            System.out.println("1. Push  2. Pop  3. TOP of Stack  4. Exit");
            y = ob.nextInt();
            switch (y) {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.top();
                    break;
                case 4:
                    break label;
            }

        }
    }
}
