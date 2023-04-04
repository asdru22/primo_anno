public class CoppiaMistaColorabile<A extends Colorabile, B extends Colorabile> extends CoppiaMista<A,B> {

	public CoppiaMistaColorabile(A primo, B secondo) {
		super(primo,secondo);
	}

	public void Colora(Colore c){
		primo.setColore(c);
		secondo.setColore(c);
	}
	@Override
	public String toString(){
		return "Il colore del primo è "+primo.getColore()+", il colore del secondo è "+secondo.getColore();
	}
	
}
