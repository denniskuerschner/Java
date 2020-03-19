package io.packageStringsSortieren;

public class Car implements Comparable<Car> {

	private String brand;
	private int hp;
	
	public Car(String brand, int hp) {
		this.brand = brand;
		this.hp = hp;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getHp() {
		return hp;
	}

	@Override
	public int compareTo(Car o) {
		
		if (hp == o.getHp()) {
			return brand.compareTo(o.getBrand());
		}
		else{
			return Integer.compare(hp, o.getHp());
		}
		
		
	}
	/* compare arrays like strings
	 
	 			 * public int compareTo(Car o) {
	 			 * 
1 Method(int)	 * return Integer.compare(hp, i.getHp());
2 Integer	 	 * Integer hp = this.hp;
	  			 * return hp.compareTo(o.getHP());
3 Strings	 	 * return brand.compareTo(o.getBrand());
	} */
	
}
