package day01;

public class MyStack<E> {
	private DynamicArrayE<E> dae;
	MyStack(){
		this.dae=new DynamicArrayE<E>(10);
	}
	public void push(E e) {
		dae.addLast(e);
	}
	public E pop() {
		return dae.deleLast();
	}
	public boolean isEmpty() {
		return dae.isEmpty();
	}
	public int getSize() {
		return dae.getSize();
	}
}
