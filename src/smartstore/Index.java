package smartstore;

import smartstore.customer.Customers;
import smartstore.exceptions.Exceptions;
import smartstore.group.Groups;
import smartstore.menu.Menu;
import smartstore.menu.OrderTypeMenu;

import java.util.Scanner;

public class Index {

	/**
	 * 스마트 스토어 운영 프로그램 개발 프로젝트
	 */
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Menu menu = new Menu(); //메뉴선택 화면들
			Groups groups = new Groups();//고객들을 등급별로 나누기 위한 클래스
			Customers customers = new Customers();//고객들의 정보를 가지고있는 클래스
			String chooseNum;

			menu.start();
			while (true) {
				menu.showMenu();    //각 메뉴별(Menu, ParameterMenu, CustomerMenu, SummaryMenu 등) 어떤메뉴가 있는지 보여준다
				chooseNum = scan.nextLine();
				System.out.println();
				//숫자로만 이루어 져있는지 체크, 선택할 수 있는 범위내의 메뉴인지 체크하고 결과에따라 true, false를 반환한다
				if (Exceptions.check(chooseNum, menu.getMenuCountMin(), menu.getMenuCountMax())) {
					//메인 메뉴에서 다른메뉴로 이동했을때 해당메뉴로 타입을 바꿔 줌
					menu = menu.setMenu(Integer.parseInt(chooseNum), groups, customers, scan);
					if (menu instanceof OrderTypeMenu)  //현재 메뉴가 OrderTypeMenu인 경우 종료
						return;
				}
			}
		}
	}

