package javapractice;

public class PolymorphicExample {

	public static void main(String[] args) {
		Animal animal = new Cat();
		Dog[] dogs = {new Dog(), new Dog()};
		Animal[] mixedAnimals = {new Dog(), new Cat(), animal};
		new PolymorphicExample().performCheckup(dogs);
		new PolymorphicExample().performCheckup(mixedAnimals);
	//	new PolymorphicExample().performCheckup(new Cat());
	}
	
	public void performCheckup(Animal [] a){
		for(Animal animal:a){
			animal.checkup();
		}
		a[0]=new Cat();
	}
}

abstract class  Animal{
	public abstract void checkup();
}

class Dog extends Animal{

	@Override
	public void checkup() {
		System.out.println("Dog checkup");
		
	}
}
	
	class Cat extends Animal{

		@Override
		public void checkup() {
			System.out.println("Cat checkup");
			
		}
	
}