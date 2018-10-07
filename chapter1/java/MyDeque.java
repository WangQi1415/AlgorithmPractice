package day01;

public class MyDeque<E> {
	private DynamicArrayE<E> dae;
	MyDeque(){
		this.dae=new DynamicArrayE<E>(10);
	}
	public void push(E e) {
		dae.addLast(e);
	}
	public E pop() {
		return dae.deleFirst();
	}
	public boolean isEmpty() {
		return dae.isEmpty();
	}
	public int getSize() {
		return dae.getSize();
	}
}
