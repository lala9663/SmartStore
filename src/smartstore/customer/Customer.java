package smartstore.customer;

import java.util.Objects;
import java.util.Scanner;

// 이 클래스는 회원 추가 하는 클래스
public class Customer {
    Scanner sc = new Scanner(System.in);
    private String serialNo;
    private String name;
    private String id;
    private int time;
    private int pay;
    private static int count = 0;
    private static final int MAX_MEMBER = 10000;    // 최대 10000명까지 생성가능 ( 관련 로직은 구현하지 않음)


    public Customer() {
        generateSerialID();
    }

    public Customer(String name, String id, int time, int pay) {
        this.name = name;
        this.id = id;
        this.time = time;
        this.pay = pay;
        generateSerialID();
    }

    private void generateSerialID() {
        if (count < MAX_MEMBER) {
            count++;
        }    // 0<   <= 10000
        serialNo = String.format("%05d", count);       // 0 <   <= 10000
    }

    @Override
    public String toString() {
        return "Customer{" +
                "serialNo=" + serialNo +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", time=" + time +
                ", pay=" + pay +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return serialNo == customer.serialNo && time == customer.time && pay == customer.pay && name.equals(customer.name) && id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNo, name, id, time, pay);
    }

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
