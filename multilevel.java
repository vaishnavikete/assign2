class vechile{
	void start() {
		System.out.println("Vechile started");
	}
}
class car extends vechile{
	void drive() {
		System.out.println("Car is driving ");
	}
}
class sportcar extends car{
	void turbo() {
		System.out.println("Turbo is started ");
	}
}
public class multilevel {
	public static void main(String[] args) {
		sportcar sc = new sportcar();
			sc.start();
			sc.drive();
			sc.turbo();
	}

}
