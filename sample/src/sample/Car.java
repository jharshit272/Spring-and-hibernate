package sample;

public class Car implements Runnable {
int speed;

static int gear;

Car(){
	speed = 10;
}
Car(int sped){
	speed = sped;
}
	public void move() {
		System.out.println("Car is moving by driver...");
		
	}

}
