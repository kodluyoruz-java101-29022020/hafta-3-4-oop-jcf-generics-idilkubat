package week_3_4_Question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DublyLinkedList list = new DublyLinkedList();
		System.out.println("Insert at Start");
		list.insertAtStart(0);
	    list.showValues();
		System.out.println("Insert at End");
        list.insertAtEnd(5);
        list.showValues();
        System.out.println("Insert at Position");  
        list.insertAtPos(1, 2);
        list.insertAtPos(2, 3);
        list.insertAtPos(3, 4);
        list.showValues();
        System.out.println("Deleting at Position 2");
        list.deleteAtPos(2);
        list.showValues();
	}

}
