public interface IStack<T> {

	// verifica se lista vuota
	public boolean isEmpty();
	
	// aggiungi elemento in testa
	public void push(T item);

	// rimuovi elemento in testa
	public T pop();
	
	// leggi elemento in testa
	public T top();

}
