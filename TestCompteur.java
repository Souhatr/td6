package td6;

public class TestCompteur {

	public static void main(String[] args) {
		Compteurord c1= new Compteurord();
		CompteurCycl c2= new CompteurCycl();
		for(int i=0;i<5;i++)
		{
			c1.incrementer();
			c2.incrementer();
			System.out.println(c1.getCourant());
			System.out.println(c2.getCourant());
			c1.raz();
			c2.raz();
		}
		c1.raz();
		c2.raz();
		System.out.println(c1.getCourant());
		System.out.println(c2.getCourant());

	}

}
