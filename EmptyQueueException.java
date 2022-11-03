package queue;
/**
 * EmptyQueueException.java extends Exception and is used to alert the user when they attempt to dequeue an empty queue
 * @author Jared Rosenberger
 * @version 9/29/22
 * EmptyQueueException.java
 * Fall 2022
 */
public class EmptyQueueException extends Exception {
	public EmptyQueueException(String message) {
		super(message);
	}//end constructor
}//end EmptyQueueException