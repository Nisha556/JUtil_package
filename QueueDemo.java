package Condition;
import java.util.PriorityQueue;
public class QueueDemo {
public static void main(String args[])
{
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	for(int i = 10; i>0;i--)
	{
		queue.add(i);
	}
		//queue (front)10 9 8 7 6 5 4 3 2 1 (rear)
		//priority queue shorts the data for us
		//queue (rear)10 9 8 7 6 5 4 3 2 1 (front)
		//peeking -> obtaining the head of the queue
		//Polling -> Remove the head of the queue
		System.out.println("Queue Size is : " +queue.size());
		
		System.out.println(queue.peek());
		queue.poll();
		System.out.println("Queue Size After Poll is" +queue.size() );
		System.out.println(queue.peek());
		
	
}
}
