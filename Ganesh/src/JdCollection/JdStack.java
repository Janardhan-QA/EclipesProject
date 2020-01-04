package JdCollection;

import java.util.Stack;

public class JdStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(null);
        s.push("String");
        System.out.println(s.peek());
        System.out.println(s.capacity());
        System.out.println(s.search(1));
        System.out.println(s.search('A'));
        System.out.println(s);
        Object o=s.pop();
        System.out.println(o);
        System.out.println(s);
	}

}
