public class range_node {
    private range range;
    private range_node next;
    
    public range_node(range range, range_node next){
        this.range = range;
        this.next = next;
    }
}
