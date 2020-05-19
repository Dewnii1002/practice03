package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		

		Goods[] a = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {

			String info = scanner.nextLine();
			String[] infos = info.split(" ");

			String name = infos[0];
			int price = Integer.parseInt(infos[1]);
			int countStock = Integer.parseInt(infos[2]);

			a[i].setGoods(name, price, countStock);
		}
		
	

		// 상품 입력

		// 상품 출력

		// 자원정리
		scanner.close();
	}
}
