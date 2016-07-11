package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = scanner.nextInt();

		while (money == 1) {
			if(money>50000){
				money = money%50000;
				count++;
			}
		}
	}
}