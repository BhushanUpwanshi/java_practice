package circularlinkedlist;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		this.head=null;
	}
	
	public void reverse() {
		Node n1=head;
		Node n2=head.getNext();
		
		while(n2!=null) {
			Node n3=n2.getNext();
			n2.setNext(n1);
			n1=n2;
			n2=n3;
		}
		head.setNext(null);
		head=n1;
	}
	
	public boolean insert(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			return true;
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		return true;
		
	}
	
	public void display() {
		Node temp=head;
		do{
			System.out.print(temp.getData()+ " ");
			temp=temp.getNext();
		}while(temp!=null) ;
		System.out.println();
	}
	
}
