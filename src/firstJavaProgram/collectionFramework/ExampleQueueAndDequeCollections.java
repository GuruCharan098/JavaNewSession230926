package firstJavaProgram.collectionFramework;

import java.util.*;

public class ExampleQueueAndDequeCollections {

	
	  public static void main(String[] args) {
		  
		  Queue<String> queue = new LinkedList<>();
		  
		    queue.offer("Rahul");
		    queue.offer("Priya");
		    queue.offer("Amit");
		    queue.offer("Rohan");
		    
		    
		    System.out.println(queue);
		    
		    System.out.println("Head: "+ queue.peek());
		    
		    System.out.println("Removed: "+ queue.poll());

		    System.out.println(queue);
		    
		    
		    // Comparator: To process larger numbers first and use a reverse order comparator. 
		    
		    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		    
		    pq.offer(10);
		    pq.offer(30);
		    pq.offer(20);
		    pq.offer(40);
		    
		    
		    System.out.println("Highest Piority : "+ pq.peek());
		    
		    while(!pq.isEmpty()) {
		    	System.out.println(pq.poll());
		    }

		    
		    Deque<Integer> dq = new ArrayDeque<>();
		    
		    dq.addFirst(20);
		    dq.addFirst(10);
		    
		    dq.addLast(30);
		    dq.addLast(40);

	    	System.out.println(dq);
	    	
	    	System.out.println(dq.peekFirst());
	    	System.out.println(dq.peekLast());


		    
		    Deque<Character> stack = new ArrayDeque<>();
		    
		    // LIFO Rules
		    stack.push('A');
		    stack.push('B');
		    stack.push('C');
		    
		    System.out.println(stack);
		    
		    System.out.println("Popped :" + stack.pop());
		    System.out.println(stack);
		    System.out.println("Top :" + stack.peek());
		    		    

	  }
	  
}
