package queue;
/**
 * LinkedList.java is a generic version of LinkedList.java 
 * @author Jared Rosenberger
 * @version 10/3/22
 * LinkedList.java
 * Fall 2022
 */
public class LinkedList<T> {	
	//Instance Variables
	private Node<T> head; //head is the first node in the list
	private Integer length; //length is a counter to tell the user how many nodes are in the list
	private Node<T> tail; //tail is the last node in the list
	
	//Constructors
	/**
	 * The no argument constructor initializes instance variables
	 */
	public LinkedList() {
		head=null;
		length=0;
		tail=head;
	}//end constructor
	
	//Accessors and Mutators
	/**
	 * @return the current value of head
	 */
	public Node<T> getList() {
		return head;
	}//end getList()
	
	/**
	 * @return the number of elements in the list
	 */
	public int getSize() {
		return length;
	}//end getSize
	
	//Other Class Methods
	/**
	 * isEmpty() returns true if the list is empty, and false if the list is not
	 * @return boolean
	 */
	public boolean isEmpty() {
		if(head==null){ 
			return true;
		}
		else return false;
	}//end isEmpty()
	/**
	 * addNode() allows the user to add nodes to the end of the list
	 * @param aNode the value of the node being added to the list, as passed into addNode()
	 */
	public void addNode(Node<T> aNode) {
		if (isEmpty()) {
			head = aNode;
			tail=head;
			length++;
			return;
		}			
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);			
		length++;
	}//end addNode()
	
	/**
	 * remove removes a node from the front of the list
	 * @return the node that was removed
	 */
	public T remove() {
		Node<T> result = head;
		head = head.getNextNode();
		length--;
		return result.getData();
	}//end remove
}//end LinkedList.java