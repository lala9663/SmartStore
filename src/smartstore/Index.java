package smartstore;

import smartstore.customer.Customers;
import smartstore.exceptions.Exceptions;
import smartstore.group.Groups;
import smartstore.menu.Menu;
import smartstore.menu.OrderTypeMenu;

import java.util.Scanner;

public class Index {

	/**
	 * 스마트 스토어 운영 프로그램
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu(); //메뉴선택 화면들
		Groups groups = new Groups();//고객들을 등급별로 나누기 위한 클래스
		Customers customers = new Customers();//고객들의 정보를 가지고있는 클래스
		String chooseNum;

		menu.start();
		while (true) {
			menu.showMenu();
			    //각 메뉴별(Classification Parameter, Customer Data, Summary 등) 어떤메뉴가 있는지 보여준다
			chooseNum = sc.nextLine();
			System.out.println();

			if (Exceptions.check(chooseNum, menu.getMenuCountMin(), menu.getMenuCountMax())) {
				//메인 메뉴에서 다른메뉴로 이동했을때 해당메뉴로 타입을 바꿔 줌
				menu = menu.setMenu(Integer.parseInt(chooseNum), groups, customers, sc);

			}
		}
	}
}

