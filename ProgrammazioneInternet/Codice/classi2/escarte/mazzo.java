public class mazzo {
    private carta[] carte;
    public mazzo(){
        this.carte = new carta[40];
        for(int i = 0; i<10; i++){
            carte[i] = new carta(i%10+1,seme.bastoni);
            carte[i+10] = new carta(i%10+1,seme.coppe);
            carte[i+20] = new carta(i%10+1,seme.denari);
            carte[i+30] = new carta(i%10+1,seme.spade);
        }
    }
    public String stampacarta(int i){
        return this.carte[i].stampacarta();
    }

    public String pesca(){
        return stampacarta(0);
    }

    public carta[] mischia(int volte){
        carta[] temp = this.carte;
        for(int i = 0;i<volte; i++){
            int r1 = (int)(Math.random()*40);
            int r2 = (int)(Math.random()*40);
            this.carte[r1] = temp[r2];
            this.carte[r2] = temp[r1];

        }

        return temp;
    }
}
