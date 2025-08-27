package Main;
import queue.ArrayListQueue;
import queue.queue;

import stack.stack;
import stack.StackArrayList;
public class Main {

	public static void main(String[] args) {
		stack s = new StackArrayList();
		queue q = new ArrayListQueue();
		q.enqueu("Bisaya");
		q.enqueu("Ahmed");
		q.enqueu("Saging");
		
		System.out.println(q.peek());
		
		q.dequeue();
		System.out.println(q.peek());
		
		s.push("1");
		s.push("2");
		s.push("3");
		s.pop();
		s.pop();
		System.out.println(s.peak());
	}

}
