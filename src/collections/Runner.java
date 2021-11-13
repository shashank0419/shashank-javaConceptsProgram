package collections;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(8);
		list.insert(14);
		list.insert(19);
		list.insertAtStart(34);
		list.insertAt(2, 43);
		
		list.show();

	}

}
