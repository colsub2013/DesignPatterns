package patterns.structural.composite;

public class Leaf extends Component {
	
	private final String name;
	
	public Leaf(String name) {
		this.name = name;
		System.out.println(name.trim() + " constructed.");
	}

	@Override
	public void display() {
		System.out.println(this.getName());
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
