package tutofinal;

public interface CommandeInterface {
	
	public void addObserver(ObservateurInterface a);
	public void removeObser(ObservateurInterface a);
	public void notifyObserver();
}
