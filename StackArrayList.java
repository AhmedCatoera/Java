package stack;
import java.util.*;


public class StackArrayList<E> implements stack<E> {
	private List<E> data = new ArrayList<>();
	@Override
	public void push(E x) {
		data.add(x);
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return data.remove(data.size() - 1);
	}

	@Override
	public E peak() {
		if (data.size() == 0) {
			throw new IllegalStateException("peeked from empty stack");
		}
		return data.get(data.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return data.size() == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
		}

	

}
