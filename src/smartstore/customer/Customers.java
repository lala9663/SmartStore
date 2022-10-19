package smartstore.customer;

import java.util.Arrays;

// 이 클래스는 회원 추가한 명단을 관리하는 클래스
public class Customers extends Customer {
    protected Customer[] customers;
    protected static int count = 0;
    public Customers(int size){
        customers = new Customer[size];
    }

    public Customers(Customer[] customers) {
        this.customers = customers;
    }

    public Customers() {

    }

    public Customer get(int i){
        return customers[i];
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customers.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customers customers1 = (Customers) o;
        return Arrays.equals(customers, customers1.customers);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(customers);
        return result;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customers=" + Arrays.toString(customers) +
                '}';
    }
}
