/*Animal class to get details*/

class Animal {
	void eat() {
		System.out.println("Eat");
	}
	void sleep() {
		System.out.println("Sleep");
	}
}
class Bird extends Animal{
	void eat() {
		super.eat();
		System.out.println("Eat Bird");
	}
	void sleep() {
		super.sleep();
		System.out.println("Sleep Bird");
	}
	void fly() {
		System.out.println("Fly Bird");
	}
}
public class Print{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Bird b = new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();

	}

}
