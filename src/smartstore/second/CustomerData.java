package smartstore.second;

import java.util.Scanner;

public class CustomerData {
    Scanner sc = new Scanner(System.in);
    public void  second(){
        while (true){


            System.out.println("======================================");
            System.out.println("1. Add Customer Data");
            System.out.println("2. View Customer Date");
            System.out.println("3. Update Customer Data");
            System.out.println("4. Delete Customer Data");
            System.out.println("5. Back");
            System.out.println("======================================");
            System.out.print("Choose One: ");

            int choice = sc.nextInt();
            if(choice == 5){
                System.out.println("이전으로 돌아갑니다");
                break;
            }
            switch (choice){
                case 1:
                    AddCustomerData addCustomerData = new AddCustomerData();
                    addCustomerData.addCustomer();

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("다시 입력하세요");
            }
        }
    }
}
