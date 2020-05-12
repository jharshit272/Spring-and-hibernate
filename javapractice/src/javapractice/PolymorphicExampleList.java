package javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PolymorphicExampleList {

	public static void main(String[] args) {
		List<Animal1> animal = new ArrayList<Animal1>();
		List<Dog1> dogs = new ArrayList<Dog1>();
		dogs.add(new Dog1());
		dogs.add(new Dog1());
		
//		new PolymorphicExampleList().performCheckup(dogs);
//		new PolymorphicExampleList().performCheckup(animal);
	}
	
	public void performCheckup(List<Object> a){
	for(int i=0; i<a.size(); i++){
		a.get(i);
	}
	//a.add(new Animal1());
	a.add(new Cat1());
	}

}

abstract class  Animal1{
	public abstract void checkup();
}

class Dog1 extends Animal1{

	@Override
	public void checkup() {
		System.out.println("Dog checkup");
		
	}
}
	
	class Cat1 extends Animal1{

		@Override
		public void checkup() {
			System.out.println("Cat checkup");
			
		}
	
}