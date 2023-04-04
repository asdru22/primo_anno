public class Pila<T> implements IPila<T> {
    protected T elem;
    protected Pila<T> next;
    
    public Pila(T item, Pila<T> next){
        elem = null;
        this.next = null;
    }
    public T getElem(){
        return elem;
    }
    public void setElem(T set){
        elem = set;
    }
    public boolean isEmpty(){
        return elem==null;
    }
    public void push(T item){
        while(next!=null){
            Pila<T> t = next;
            next=new Pila<T>(item,null);
        }
    }
    public T pop(){
        return elem;
    }
    public T top(){
        return elem;
    }
}