package prob7;

public abstract class Bird {
	String name;
	String song;
	int legs = 2;
	int length = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	public abstract void sing();
	public abstract void fly();
}