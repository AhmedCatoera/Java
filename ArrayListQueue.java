package queue;
import java.util.*;
public class ArrayListQueue<E> implements queue<E> {

	private List<E> data = new ArrayList<>();
	
	@Override
	public void enqueu(E x) {
		data.add(x);
	}

	@Override
	public E dequeue() {
		return data.remove(data.size() - data.size());
		 
	}

	@Override
	public E peek() {
		
		return data.get(data.size() - data.size());
	}

	@Override
	public boolean isEmpty() {
		
		return data.size() == 0;
	}

	@Override
	public int size() {
		
		return data.size();
	}

}
