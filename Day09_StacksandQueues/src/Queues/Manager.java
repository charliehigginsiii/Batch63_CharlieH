package Queues;


class Queue{
	int[] queue=new int[0];
	public boolean isEmpty() {
		boolean empty=false;
		if(queue.length==0) {
			empty=true;
		}else {
			empty=false;
		}
		return empty;
	}
	public void enqueue(int number) {
		int[] newnum=new int[1];
		newnum[0]=number;
		if(isEmpty()) {
			queue=newnum;
		}else {
			int[]mergedarray=new int[queue.length+1];
			for(int i=0;i<queue.length;i++) {
				mergedarray[i]=queue[i];
			}
			mergedarray[mergedarray.length-1]=newnum[0];
			queue=mergedarray;
		}
	}	
	public void dequeue() {
		int[]newqueue=new int[queue.length-1];
		int index=0;
		for(int i=0;i<queue.length;i++) {
			if(i==0) {
				continue;
			}else {
				newqueue[index]=queue[i];
				index++;
			}
		}
		queue=newqueue;
	}
}
public class Manager {
	public static void main(String[]args) {
		Queue queueobj=new Queue();
		System.out.println("Current Queue");
		queueobj.enqueue(5);
		queueobj.enqueue(2);
		queueobj.enqueue(3);
		queueobj.enqueue(7);
		for(int i=0;i<queueobj.queue.length;i++) {
			System.out.print(queueobj.queue[i]+" ");
		}
		queueobj.dequeue();
		System.out.println();
		System.out.println("Current Queue");
		for(int i=0;i<queueobj.queue.length;i++) {
			System.out.print(queueobj.queue[i]+" ");
		}
		System.out.println();
	}
}
