package smartstore.second;

import java.util.ArrayList;
import java.util.Scanner;

// 이 클래스는 회원 추가 하는 클래스
public class Customer {
    Scanner sc = new Scanner(System.in);

    String[] names = new String[100];
    String[] ids = new String[100];
    int[] times = new int[100];
    int[] pays = new int[100];
    int plus = 0;
    int sum = 0;

    public String[] getNames() {
        return names;
    }

    public String[] getIds() {
        return ids;
    }

    public int[] getTimes() {
        return times;
    }

    public int[] getPays() {
        return pays;
    }

    public void list(){

        while (true){
            System.out.println("** Press -1, if you want to exit! **");
            System.out.print("How many customers to input? ");
            int count = sc.nextInt();
            if(!(count == 0 || count == 1)){
            for (int i = 0; i <count; i++) {
                System.out.println("========== Customer " + (i + 1) + " Info. =========");
                System.out.println("=============================================");
                System.out.println("1. Customer Name");
                System.out.println("2. Customer ID");
                System.out.println("3. Customer Spent Time");
                System.out.println("4. Customer Total Pay");
                System.out.println("5. Back or 다음");
                System.out.println("=============================================");
                System.out.print("Choose One: ");

                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.print("Customer Name: ");
                        String name = sc.next();
                        names[count] = name;
                    case 2:
                        System.out.print("Customer ID: ");
                        String id = sc.next();
                        ids[count] = id;
                    case 3:
                        System.out.print("Customer Spent Time: ");
                        int time = sc.nextInt();
                        times[count] = time;
                    case 4:
                        System.out.print("Customer Total Pay: ");
                        int pay = sc.nextInt();
                        pays[count] = pay;
                }
            }
                System.out.println(ArrayList);
            } else if (count == 0) {
                break;

            }
        }
    }

}
