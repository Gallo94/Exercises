import java.util.NoSuchElementException;

public class Queue
{	
	public static class Node
	{
		private String str;
		private Node next;
		
		public Node(String str)
		{
			this.str = str;
			this.next = null;
		}
	}
	
	public class Iterator
	{
		private Node current = null;
		
		public Iterator()
		{
			this.current = head;
		}
		
		public boolean hasNext()
		{
			if (numNodes <= 1)
				return false;
			
			return current.next != null;
		}

		public Node next()
		{	
			if (numNodes == 0)
				return null;	

			Node ret;

			if (head.equals(tail))
			{
				ret = head;
				current = head;
			}
			else
			{
				ret = current.next;
				current = current.next;
			}
			
			return ret;
			
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
		System.out.println("Add elements");
		queue.add("ciao");
		queue.add("ciao2");
		queue.add("ciao3");
		queue.add("ciao4");
		queue.print();
		System.out.println("Remove elements");
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.print();
	}
}
