
public class Main {
	private static int index = 0;
	final static int SIZE = 1000;

	public static void add(Plant[] plants, Plant p) {
		if(index >= SIZE) {
			System.out.println("Array size exceeds!");
			return;
		}
		plants[index] = p;
		index++;
	}
	
	public static void remove(Plant[] plants, String n) {
		if(index>SIZE) {
			return;
		}
		
		for(int i=0; i<index; i++) {
			if(plants[i].getName().equals(n)) {
				for(int j=i;j<index-1;j++) {
					plants[j] = plants[j+1];
				}
				index--;
			}
		}
		System.out.println("Removed!");
	}
	
	public static Plant search(Plant[] plants, String n) {
		for(int i=0; i<index; i++) {
			if(plants[i].getName().equals(n)) {
				return plants[i];
			}
		}
		return null;
	}
	
	public static void display(Plant[] plants) {
		for(int i=0; i<index; i++) {
			System.out.println(plants[i]);
		}
	}
	
	public static void main(String[] args) {
		Plant[] plants = new Plant[SIZE];
		
		Plant p1 = new Flower("Red","Rose",true,true);
		Plant p2 = new Herb("Green","Oregano",true,"Summer");
		
		add(plants, p1);
		add(plants,p2);
		
		display(plants);
		
		remove(plants, "Oregano");
		display(plants);
		

	}

}
