package prob2;

public class CountCoins {
	private int unit = 0;
	private int money = 0;

	public int cmoney(int money, int unit) {
		int count = 0;
		int rest = (money % unit);
		// System.out.println(money);
		// System.out.println(unit);
		while (rest < unit) {
			money = (rest % unit);
			//System.out.println(money);
			count++;
		//	System.out.println("갯수 : " + count);
		}//System.out.println(unit + "원 : " + count + "개");
		return money;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}