package Stacks;
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
			int index=0;
			for(int i=queue.length-1;i>=0;i--) {
				mergedarray[index]=queue[i];
				index++;	
			}
			mergedarray[mergedarray.length-1]=newnum[0];
			queue=mergedarray;
		}
	}	
	public void dequeue() {
		
	}
}
class Stack{
	int[]stack=new int[0];
	public boolean isEmpty() {
		boolean empty=false;
		if(stack.length==0) {
			empty=true;
		}else {
			empty=false;
		}
		return empty;
	}
	public void push(int number) {
		int[] newnum=new int[1];
		newnum[0]=number;
		if(isEmpty()) {
			stack=newnum;
		}else {
			int[]mergedarray=new int[stack.length+newnum.length];
			for(int i=0;i<stack.length;i++) {
				mergedarray[i]=stack[i];
			}
			mergedarray[mergedarray.length-1]=newnum[0];
			stack=mergedarray;
		}
	}
	public void pop() {
		int[] newstack=new int[stack.length-1];
		int j=0;
		for(int i=0;i<stack.length;i++) {
			if(i!=stack.length-1){
				newstack[j]=stack[i];
				j++;
			}
		}
		stack=newstack;
	}
	public int peek() {
		return stack[stack.length-1];
	}
}
public class Manager {
	public static void main(String[]args) {
		Stack stackobj=new Stack();
		Queue queueobj=new Queue();
		System.out.println("Current Stack");
		stackobj.push(5);
		stackobj.push(2);
		stackobj.push(3);
		stackobj.push(4);
		for(int i=stackobj.stack.length-1;i>=0;i--) {
			System.out.println(stackobj.stack[i]);
		}
		System.out.println("Current Peek: ");
		System.out.println(stackobj.peek());
		stackobj.pop();
		System.out.println("New Stack");
		for(int i=stackobj.stack.length-1;i>=0;i--) {
			System.out.println(stackobj.stack[i]);
		}
		System.out.println("Current Peek: ");
		System.out.println(stackobj.peek());
		System.out.println();
		System.out.println();
		queueobj.enqueue(5);
		queueobj.enqueue(2);
		for(int i=queueobj.queue.length-1;i>=0;i--) {
			System.out.print(queueobj.queue[i]+" ");
		}
	}
}
