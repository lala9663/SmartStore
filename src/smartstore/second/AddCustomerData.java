package smartstore.second;

import java.util.Scanner;

public class AddCustomerData {
    Scanner sc = new Scanner(System.in);

    public void addCustomer(){
        System.out.println("** Press -1, if you want to exit! **");
        System.out.print("How many customers to input? ");
        int addcus = sc.nextInt();


        while (true){
            if (addcus == -1){
                System.out.println("이전으로 돌아갑니다!");
                break;
            }
            for (int i = 0; i <addcus ; i++) {
                System.out.println("======================================");
                System.out.println("1. Customer Name");
                System.out.println("2. Customer ID");
                System.out.println("3. Customer Spent Time");
                System.out.println("4. Customer Total pay");
                System.out.println("5. Back");
                System.out.println("======================================");
                System.out.print("Choose One: ");

                int choice = sc.nextInt();
                if (choice == 5){
                    System.out.println("이전? 으로 돌아갑니다");
                    break;      // 이전으로 돌아가면 회원 추가 스킵?
                }
                switch (addcus){
                    case 1:
                        Customer name = new Customer();
                        name.Name();
                        break;
                    case 2:
                        Customer id = new Customer();
                        id.ID();
                        break;
                    case 3:
                        Customer time = new Customer();
                        time.SpentTime();
                        break;
                    case 4:
                        Customer pay = new Customer();
                        pay.TotalPay();
                        break;
                }

            }
        }
    }
}
