package JdCollection;

import java.util.PriorityQueue;

public class JdPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		PriorityQueue pq = new PriorityQueue();
		pq.offer("jannu");
		pq.offer("anu");
		pq.offer("priya");
		pq.offer("sravs");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		//System.out.println(pq.spliterator());
		System.out.println(pq.comparator());
	    System.out.println(pq.element());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		pq.add("hello");
		//pq.addAll(pq);
		//pq.removeAll(pq);
		System.out.println(pq.contains("priya"));
System.out.println(pq.isEmpty());
System.out.println(pq.size());
System.out.println(pq.iterator());
System.out.println(pq.toArray());
		
		
		
	}

}
