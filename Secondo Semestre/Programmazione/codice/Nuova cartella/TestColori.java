class TestColori {
    public static void main(String[] args){
        Parete p = new Parete(); 
        Foglio f = new Foglio();
        p.setColore(Colore.giallo);

        CoppiaMistaColorabile<Foglio,Parete> coppia = new CoppiaMistaColorabile<>(f,p);
        coppia.Colora(Colore.verde);
        System.out.println(coppia.toString());
        System.out.println(f.getColore());

        System.out.println(coppia.checkOmogenei());
    }
}
