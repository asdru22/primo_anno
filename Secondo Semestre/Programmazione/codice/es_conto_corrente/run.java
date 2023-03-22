class run{
    public static void main(String[] args){
        /* 
        ContoCorrente t = new ContoCorrente("A", 54, 4.5);
        t.Deposit(43.5);
        System.out.println(t.toString());
        ContoCorrenteInternazionale b = new ContoCorrenteInternazionale("B", 54);
        b.Deposit(243);
        System.out.println(b.toString());
        */
        ContoCompleto c = new ContoCompleto("C", 54);
        c.Deposit(243,"soldi rubati a bambini cechi");
        c.Withdraw(5);
        c.stampaMovimenti(2);

    }
}