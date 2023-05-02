public class box<T> {
    private T stored;

    public box(T stored){
        this.stored = stored;
    }

    public String getStored(){
        return stored.toString();
    }
}
