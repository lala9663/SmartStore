package smartstore.customer;

import java.util.Objects;
import java.util.Scanner;

// 이 클래스는 회원 추가 하는 클래스
public class Customer {
    Scanner sc = new Scanner(System.in);
    protected String serialNo;
    protected String name;
    protected String id;
    protected int time;
    protected int pay;
    private static int count = 0;
    private static final int MAX_MEMBER = 10000;


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

}
