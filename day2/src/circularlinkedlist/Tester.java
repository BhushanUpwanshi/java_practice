package circularlinkedlist;

public class Tester {
	public static void main(String[] args) {
		//CircularLinkedList c1 =new CircularLinkedList();
		
		LinkedList c1=new LinkedList();
		
		System.out.println(c1.insert(10));
		c1.insert(20);
		c1.insert(30);
		c1.insert(40);
		
		c1.display();
		
//		System.out.println(c1.insert(60,4));
//		c1.display();
//		System.out.println(c1.insert(70,1));
//		c1.display();
//		System.out.println(c1.insert(80,8));
//		c1.display();
		System.out.println("------------------");
		c1.reverse();
		c1.display();
//		c1.deleteByVal(20);
//		c1.display();
//		System.out.println("------------------");
//		c1.deleteByVal(50);
//		c1.display();
	}
}
