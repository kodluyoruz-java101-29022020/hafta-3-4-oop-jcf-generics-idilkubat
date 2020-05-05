package week_3_4_Question2;


public class Node {
	
	//Verilerimizi bu classta tutuyoruz
	
	Node prev;
	int value;
	Node next;
	
	public Node() {
        this.next = null;
        this.prev = null;
        this.value = 0;
    }
	
	public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
	
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	


}
