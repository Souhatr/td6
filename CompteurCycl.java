package td6;

public class CompteurCycl extends Compteur {
	final int MAX=4;
	public void incrementer()
	{
		if(this.courant==MAX)
			this.courant=0;
		else
			this.courant++;
	}
}
