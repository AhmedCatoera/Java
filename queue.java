package queue;

public interface queue<E> {
	
	void enqueu(E x);
	
	E dequeue();
	
	E peek();
	
	boolean isEmpty();
	
	int size();
	
}