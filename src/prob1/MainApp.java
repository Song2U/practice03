package prob1;

public class MainApp {
	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		mulAdd(data);
	}

	public static void mulAdd(int[] d) {
		int count = 0;
		int mAdd = 0;
		for (int i = 0; i < d.length; i++) {
			if ((d[i] % 3) == 0) {
				count += 1;
				mAdd = mAdd + d[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수	=> " + count);
		System.out.println("주어진 배열에서 3의 배수의 합	=> " + mAdd);
	}
}