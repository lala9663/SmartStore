package smartstore.customer;

import smartstore.exceptions.Exceptions;
import java.util.Scanner;

public class Customers {
    Customer[] customers = new Customer[100];
    int customerNum = 0;

    public void addCustomer(Scanner sc){
        while (true){
            Print.check();
            String input = sc.nextLine();
            if (input.equals("0"))
                return;
            if (Exceptions.check(input, 0, Integer.MAX_VALUE)){
                int size = Integer.parseInt(input);
                if (size == 0)
                    return;
                createCustomer(size, sc);
            }
        }
    }

    private void createCustomer(int size, Scanner sc){
        for (int i = 0; i < size ; i++) {
            Customer customer = new Customer();
            System.out.println("========== Customer " + (i + 1) + " Info. =========");
        customers[customerNum] = customer;
        customerNum++;
        setCustomer(customer, sc);
        }
    }

    public void setCustomer(Customer customer, Scanner sc){
        while (true){
            Print.CustomerInfo();
            String input = sc.nextLine();
            if (Exceptions.check(input, 1, 5)){
                int chooseNum = Integer.parseInt(input);
                if (chooseNum == 1){
                    setName(customer, sc);
                }else if (chooseNum == 2){
                    setID(customer, sc);
                }else if (chooseNum == 3){
                    setSpentTime(customer, sc);
                } else if (chooseNum == 4){
                    setTotalPay(customer, sc);
                }else if (chooseNum == 5){
                    break;
                }
            }
        }
    }

    private void setName(Customer customer, Scanner sc){
        while (true){
            String input = sc.nextLine();
            System.out.println("Input Customer's Name: ");
            if (input.length() >= 3 && Exceptions.checkStringType(input) == true){
                customer.name = input;
                break;
            }
            System.out.println("유요하지 않아요 다시요");
        }
    }
    private void setID(Customer customer, Scanner scan) {
        while (true) {
            String input = scan.nextLine();
            System.out.println("Input Customer's UserID: ");
            if (input.length() >= 5 &&
                    ('a' <= input.charAt(0) && input.charAt(0) <= 'z') &&
                    ('A' <= input.charAt(0) && input.charAt(0) <= 'Z')) {
                customer.id = input;
                break;
            }
            System.out.println("유요하지 않아요 다시요");
        }
    }

    private void setSpentTime(Customer customer, Scanner scan) {
        while (true) {
            String input = scan.nextLine();
            System.out.println("Input Customer's Spent Time at Your Store: ");
            if (Exceptions.check(input, 0, Integer.MAX_VALUE)) {
                customer.time = Integer.parseInt(input);
                break;
            }
            System.out.println("Invalid Format for Input. Please try again.\n");
        }
    }


    private void setTotalPay(Customer customer, Scanner scan) {
        while (true) {
            String input = scan.nextLine();
            System.out.println("Input Customer's Spent Time at Your Store:\n");
            if (Exceptions.check(input, 0, Integer.MAX_VALUE)) {
                customer.pay = Integer.parseInt(input);
                break;
            }
            System.out.println("Invalid Format for Input. Please try again.\n");
        }
    }

    public void viewCustomer(){
       Print.view();
        for (int i = 0; i <customerNum; i++) {
            System.out.println("No. " + (i+1) + " => " + customers[i].toString());
        }
    }

    public void updateCustomer(Scanner sc){
        viewCustomer();
        System.out.println();
        System.out.println("Which customer ( 1 ~ " + (customerNum) + " )?");
        String input = sc.nextLine();
        if (Exceptions.checkStringType(input)){
            int no = Integer.parseInt(input);
            if (0 <= no && no <= customerNum){
                setCustomer(customers[customerNum -1], sc);
            }
        }

    }

}


