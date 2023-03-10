
public class Node<T> {
	private T value;
	private Node<T> next;
	
	/** Creates a new Node.
	 * @param val the value for the Node.
	 * @param nxt the link to the next Node.
	 */
	public Node(T val, Node<T> nxt) {
		this.value = val;
		this.next = nxt;
	}
		
	/** Returns the next Node.
	 * @return the next Node.
	 */
	public Node<T> getNext() {
		return this.next;
	}
		
		
	/** Returns the value of the Node.
	 * @return the value.
	 */
	public T getValue() {
		return this.value;
	}
		
	/** Sets the next node.
	 * @param nxt the next node.
	 */
	public void setNext(Node<T> nxt) {
		this.next = nxt;
	}
}