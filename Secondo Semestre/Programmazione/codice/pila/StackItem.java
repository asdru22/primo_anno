public class StackItem<T> {
	
	private T val;
	private StackItem<T> next;
	
	public StackItem(T val){
		this.val = val;
		this.next = null;
	}
	
	public T getVal(){
		return this.val;
	}
	
	public StackItem<T> getNext(){
		return this.next;
	}
	
	public void setNext(StackItem<T> next){
		this.next = next;
	}

}