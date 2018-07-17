public class Queue
{	
	public static class Node
	{
		private String str;
		private Node next;
		
		public Node()
		{
			this.str = "";
			this.next = null;			
		}
		
		public Node(String str)
		{
			this.str = str;
			this.next = null;
		}
	}
	
	public class Iterator
	{
		private Node current;
		private int iterations = 0;
		
		public Iterator()
		{
			this.current = new Node();
		}
		
		public boolean hasNext()
		{		
			return this.iterations < Queue.this.numNodes;
		}

		public Node next()
		{	
			if (this.current.next == null)
				this.current = head;
			else
				this.current = this.current.next;
			
			iterations++;
			
			return current;
		}
	}
	
	Node head;
	Node tail;
	int numNodes;
	
	public Queue()
	{
		this.numNodes = 0;
		this.tail = null;
		this.head = null;
	}
	
	public void add(String str)
	{
		Node node = new Node(str);
		if(numNodes == 0)
		{
			this.tail=node;
			this.head=node;
		}
		else
		{
			tail.next = node;
			tail = node;
		}
		numNodes++;
	}
	
	public void remove()
	{
		if (numNodes == 1)
		{
			this.head = null;
			this.tail = null;
		}
		else
		{
			head = head.next;
		}
		numNodes--;
	}
	
	public Iterator iterator()
	{
		return new Iterator();
	}
	
	public void print()
	{
		Iterator itr = this.iterator();
		while (itr.hasNext())
		{
			Node node = itr.next();
			System.out.println(node.str);
		}
	}
	
	public static void main(String args[])
	{
		Queue queue = new Queue();
		System.out.println("Before elements deletion");
		queue.add("ciao");
		queue.add("ciao2");
		queue.add("ciao3");
		queue.add("ciao4");
		queue.print();
		System.out.println("After elements deletion");
		queue.remove();
		queue.remove();
		queue.print();
	}
}
