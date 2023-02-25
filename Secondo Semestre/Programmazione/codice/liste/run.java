class run{
    public static void main(String[] args){
        nodo n1 = new nodo(5,null);
        nodo n2 = new nodo(3,n1);
        nodo n3 = new nodo(7,n2);

        //System.out.println(n3.next().next().get_val());
        System.out.println(n3.find(5).get_val());
        
    }
}