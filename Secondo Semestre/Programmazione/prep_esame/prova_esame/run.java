class run{
    public static void main(String[] args){
        Garage g = new Garage();
        g.add(new Automobile(2,"sa","safd",4,2));
        g.add(new Furgone(2,"sdas","af",4,2));
        g.add(new Motocicletta(2,"sdas","af",4,"asdas",2));

        //System.out.println(g.conta(0));
        //g.stampa();
        g.estrai();
        g.export(5);
    }
}