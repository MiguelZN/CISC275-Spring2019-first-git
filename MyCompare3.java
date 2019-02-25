/*Miguel Zavala
2/25/19
CISC275
Harvey
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal{
	int numLegs;
	Animal(int numLegs){
		this.numLegs = numLegs;
	}
	public int getLegs(){
		return this.numLegs;
	}
}

class Dog extends Animal{
	String name;
	Dog(String name, int numLegs){
		super(numLegs);
		this.name = name;
		
	}
	public String toString(){
		return "["+this.name+", "+this.numLegs+"]";
	}
}

public class MyCompare3 {
	public static void main(String[] args){
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>(){
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
	}
}
