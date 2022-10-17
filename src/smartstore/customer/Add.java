package smartstore.customer;

import java.util.Scanner;
public class Add extends Customer{

    public void list() {
        Print.check();
        int count = sc.nextInt();

        if (count == 0) {
            Print.out();
        } else {
            while (true) {
                for (int i = 0; i < count; i++) {
                    System.out.println("========== Customer " + (i + 1) + " Info. =========");
                    Print.join();
                    int num = sc.nextInt();
                    switch (num) {
                        case 5:
                            break;
                        case 1:
                            System.out.print("Customer Name: ");
                            name = sc.next();

                        case 2:
                            System.out.print("Customer ID: ");
                            id = sc.next();

                        case 3:
                            System.out.print("Customer Spent Time: ");
                            time = sc.nextInt();

                        case 4:
                            System.out.print("Customer Total Pay: ");
                            pay = sc.nextInt();
                    }
                    System.out.println("========== Customer " + (i + 1) + " Info. =========");
                    System.out.printf("%d\t, %s\t %s\t %s\t %s\n", i + 1, name, id, time, pay);
                }
                break;

            }
        }
    }
}
