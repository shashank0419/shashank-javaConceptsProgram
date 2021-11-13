package collections;

public class LinkedList {

	Node head;

	public void insert(int num) {
		Node node = new Node();
		node.data = num;
		node.nextRef = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.nextRef != null) {

				n = n.nextRef;
			}
			n.nextRef = node;

		}
	}
	
	public void insertAtStart(int num) {
		Node node = new Node();
		node.data = num;
		node.nextRef = head;
		head = node;
		
	}

	public void insertAt(int loc, int num) {
		Node n1 = new Node();
		n1.data = num;
		n1.nextRef = null;
		Node node1 = head;
		for (int i = 0; i < loc - 1; i++) {

			node1 = node1.nextRef;
		}
		n1.nextRef = node1.nextRef;
		node1.nextRef = n1;
	}

	public void show() {
		Node node;
		node = head;
		while (node.nextRef != null) {
			System.out.println(node.data);
			node = node.nextRef;
		}
		System.out.println(node.data);
		//System.out.println(head.data);
	}
}
