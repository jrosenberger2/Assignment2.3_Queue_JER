/** 
 * Node.java turns Node.java into generic Code
 * @author Jared Rosenberger
 * @version 11/9/22
 * Node.java
 * Fall 2022
 */
public class Node<T> {
	//Instance Variables
	private T data; //data is a generic variable to hold the data in each node
	private Node<T> nextNode; //nextNode is a GenericNode to hold the place of the next node in the list
	
	//Constructors
	/**
	 * The no argument constructor initializes the instance variables
	 */
	public Node() {
		nextNode=null;
		data=null;
	}//end constructor
	
	//Accessors and Mutators
	/**
	 * 
	 * @param data the value of data as passed into setData()
	 */
	public void setData(T data) {	
		this.data=data;	
	}//end setData()
	
	/**
	 * 
	 * @return the current value of data
	 */
	public T getData() {
		return data;
	}//end getData()
	
	/**
	 * 
	 * @return the current Node
	 */
	public Node<T> getNode() {
		return this;
	}//end getNode()
	
	/**
	 * 
	 * @param nextNode the value if nextNode as passed into setNextNode()
	 */
	public void setNextNode(Node<T> nextNode) {
		this.nextNode=nextNode;
	}//end setNextNode()
	
	/**
	 * 
	 * @return the current value of nextNode
	 */
	public Node<T> getNextNode() {
		return nextNode;
	}//end getNextNode()
}//end GenericNode.java
