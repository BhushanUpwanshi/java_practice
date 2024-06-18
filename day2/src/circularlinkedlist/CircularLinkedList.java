package circularlinkedlist;

public class CircularLinkedList {
	private Node head;
	
	public CircularLinkedList() {
		this.head=null;
	}
	
	public boolean insert(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			head.setNext(head);
			return true;
		}
		
		Node temp=head;
		while(temp.getNext()!=head) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setNext(head);
		return true;
		
	}
	
	public boolean insert(int data,int pos) {
		if((head==null && pos>1) ||pos<=0) {
			return false;
		}
		//validation for 1
		Node newNode=new Node(data);
		if(pos==1) {
			if(head==null) {
				head=newNode;
				head.setNext(newNode);
				return true;
			}
			Node last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			newNode.setNext(head);
			head=newNode;
			last.setNext(newNode);
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev==head)
				return false;
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}
	
	public void deleteByVal(int val) {
		
		if(head.getData()==val) {
			if(head.getNext()==head) {
				head=null;
			}
			Node last=head;
			while(last.getNext()!=head)
				last=last.getNext();
			last.setNext(head.getNext());
			head=head.getNext();
		}
		
		Node prev=head;
		while(prev.getNext().getData()!=val) {
			prev=prev.getNext();
			if(prev==head)
				return;
		}
		prev.setNext((prev.getNext()).getNext());
		
	}
	
	public boolean deleteByPos(int pos) {
		if(head==null || pos<=0)
			return false;
		if(pos==1) {
			if(head.getNext()==head) {
				head=null;
				return true;
			}
			Node last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			head=head.getNext();
			last.setNext(head);
			return true;
		}
		Node prev=head,del=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev==head)
				return false;
		}
		
		del=prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}

	public void display() {
		Node temp=head;
		do {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}while(temp !=head);
		System.out.println();
	}
	
}

















