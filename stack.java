package stack;

public interface stack<E> {
		
		void push(E x);
		
		E pop();
		
		E peak();
		
		boolean isEmpty();
		
		int size();
		
	}

