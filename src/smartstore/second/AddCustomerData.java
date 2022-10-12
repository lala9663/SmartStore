package smartstore.second;

import smartstore.second.member.Member;
import smartstore.second.Customer;

import java.util.Scanner;

public class AddCustomerData {
    Scanner sc = new Scanner(System.in);
    public int members;

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public static void addCustomer(){
        Customer customer = new Customer();
        customer.list();

    }
}
