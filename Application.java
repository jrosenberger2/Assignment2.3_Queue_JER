/**
 * Application tests the methods of Queue.java
 * @author Jared Rosenberger
 * @version 11/9/22
 * Application.java
 * Fall 2022
 */
public class Application {
	public static void main(String[] args) throws Exception {
	Queue<String> myQueue = new Queue<String>();
	
	//Bill, Alice and Bob are in line.
	myQueue.enqueue("Bill");
	myQueue.enqueue("Alice");
	myQueue.enqueue("Bob");
	System.out.println("There are " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	
	//A customer has been served
	System.out.println(myQueue.dequeue() + " has been served.");
	System.out.println("There are now " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	
	//Jane arrives
	System.out.println("Jane has arrived.");
	myQueue.enqueue("Jane");
	System.out.println("There are now " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	
	//Hamad arrives
	System.out.println("Hamad has arrived.");
	myQueue.enqueue("Hamad");
	System.out.println("There are now " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	
	//Two customers are served
	System.out.println(myQueue.dequeue() + " has been served.");
	System.out.println("There are now " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	System.out.println(myQueue.dequeue() + " has been served.");
	System.out.println("There are now " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	
	//Jim arrives
	System.out.println("Jim has arrived.");
	myQueue.enqueue("Jim");
	System.out.println("There are now " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	
	//Another customer is served
	System.out.println(myQueue.dequeue() + " has been served.");
	System.out.println("There are now " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	
	//Another customer is served
	System.out.println(myQueue.dequeue() + " has been served.");
	System.out.println("There are now " + myQueue.getSize() + " people in line. The line consists of:");
	myQueue.printQueue();
	}//end main
}//end Application
