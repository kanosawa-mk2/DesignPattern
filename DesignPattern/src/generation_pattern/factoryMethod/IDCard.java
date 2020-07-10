package generation_pattern.factoryMethod;

public class IDCard extends Product {

	private String owner;

	public IDCard(String owner) {
		System.out.println(String.format("%sのカードを作成", owner));
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(String.format("%sカードを使用",this.owner));
	}

	public String getOwner() {
		return this.owner;
	}

}
