import java.util.*;

class GQueue<T>{
	int tos;
	Object[] q;
	public GQueue() {
		tos=0;
		q=new Object[10];
	}
	public void push(T item) {
		if(tos==10)
			return;
		q[tos]=item;
		tos++;
	}
	public T pop() {
		if(tos==0)
			return null;
		tos--;
		return (T)q[tos];
	}
}

public class GenericProb {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		System.out.print("Enqueue: ");
        q1.offer(scanner.next());
        q1.offer(scanner.next());
        q1.offer(scanner.next());
        
        System.out.print("Dequeue: ");
        System.out.print(q1.poll()+" ");
        System.out.print(q1.poll()+" ");
        System.out.println(q1.poll());
        System.out.println();
        
        
        PriorityQueue<Integer> q2 = new PriorityQueue<Integer>();
		System.out.print("Enqueue: ");
        q2.offer(scanner.nextInt());
        q2.offer(scanner.nextInt());
        q2.offer(scanner.nextInt());
        
        System.out.print("Dequeue: ");
        System.out.print(q2.poll()+" ");
        System.out.print(q2.poll()+" ");
        System.out.println(q2.poll());
        System.out.println();
        
        
        scanner.close();
       
	}
	
}
        
