class run{
    public static void main(String[] args){
    Squadra s = new Squadra();
    s.aggiungiLavoratore(new Operaio("maurizio",0, 1992,23));
    //s.popolaDaFile("in.tsv");   
    s.salvaSuFile("out.txt");   
    //System.out.println(s.calcolaStipendi());
    }
}