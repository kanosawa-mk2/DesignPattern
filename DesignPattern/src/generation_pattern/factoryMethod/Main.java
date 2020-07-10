package generation_pattern.factoryMethod;

public class Main {

	public static void main(String[] args) {
		Factory f = new IDCardFactory();
		Product card1 = f.create("wakame");
		Product card2 = f.create("katuo");

		card1.use();
		card2.use();

	}

}
