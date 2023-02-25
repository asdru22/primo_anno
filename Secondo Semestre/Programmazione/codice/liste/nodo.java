public class nodo{
    private int val;
    private nodo next;

    public nodo(int val,nodo next){
        this.val = val;
        this.next = next;
    }

    public nodo(){
        this.val = 0;
        this.next = null;
    }

    public void set_val(int val){
        this.val = val;
    }

    public int get_val(){
        return val;
    }

    public nodo find(int val){
        nodo out = find(this,val);
        if(out==null) System.out.println("Valore non trovato");
        return out;
    }
    // soluzione ricorsiva
    private nodo find(nodo nodo, int val){
        if(nodo!=null) return (nodo.get_val()==val) ? nodo : find(nodo.next,val);
        else return null;
    }
}