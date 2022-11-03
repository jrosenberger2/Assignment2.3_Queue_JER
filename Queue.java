package queue;
/**
 * Queue is a generic implementation of the Queue ADT
 * @author Jared Rosenberger
 * @version 10/3/22
 * Queue.java
 * Fall 2022
 */
public class Queue<T> implements QueueInterface<T>{
	private LinkedList<T> queueList;//The LinkedList the Queue is built on
	
	/**
	 * The 1 argument  initializes instance variables 
	 */
	public Queue() {
		queueList = new LinkedList<T>();
	}//end constructor
	
	/**
	 * enqueue adds a new element to the rear of the queue
	 * @param newEntry is the element to be added to the queue
	 */
	public void enqueue(T newEntry) {
		Node<T> entry = new Node<T>();
		entry.setData(newEntry);
		queueList.addNode(entry);
	}//end enqueue
	 
	/**
	 * dequeue removes an element from the front of the queue
	 * @return the element removed from the queue
	 */
	public T dequeue() throws Exception{
		if(isEmpty())
			throw new EmptyQueueException("The Queue is Empty");
		else
			return queueList.remove();
	}//end dequeue
	
	/**
	 * getFront returns the element at the front of the list without removing it
	 * @return the first element of the queue
	 */
	public T getFront() {
		return queueList.getList().getData();
	}//end getFront
	
	/**
	 * @return the number of elements in the Queue
	 */
	public int getSize() {
		return queueList.getSize();
	}//end getSize
	
	/**
	 * isEmpty returns a boolean representation of the number of elements in the queue
	 * @return true if the queue has 0 elements and false otherwise
	 */
	public boolean isEmpty() {
		return queueList.isEmpty();
	}//end isEmpty
	
	/**
	 * clear removes every item from the queue
	 */
	public void clear() {
		while(!queueList.isEmpty()) {
			queueList.remove();
		}
	}//end clear
	
	/**
	 * printQueue prints all the elements currently in the queue without removing any
	 */
	public void printQueue() {
		if(isEmpty())
			System.out.print("There are no items in the queue\n");
		Node<T> iterator = new Node<T>();
		iterator = queueList.getList();
		for(int i=0; i<queueList.getSize(); i++) {
			System.out.print(iterator.getData() + ", ");
			//if(iterator.getNextNode() != null)
				iterator = iterator.getNextNode();
		}
		System.out.println("\n");
	}//end print Queue
}//end Queue<T>