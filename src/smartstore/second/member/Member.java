package smartstore.second.member;

import smartstore.second.AddCustomerData;

import java.util.Objects;
import java.util.Scanner;

public class Member {
    AddCustomerData addCustomerData = new AddCustomerData();
    public int serialNo = 0;
    public String customerName = "";
    public String customerID = "";
    public int spentTime = 0;
    public int totalPay = 0;


    @Override
    public String toString() {
        return "Member{" +
                "serialNo=" + serialNo +
                ", customerName='" + customerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", spentTime=" + spentTime +
                ", totalPay=" + totalPay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return serialNo == member.serialNo && spentTime == member.spentTime && totalPay == member.totalPay && Objects.equals(customerName, member.customerName) && Objects.equals(customerID, member.customerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNo, customerName, customerID, spentTime, totalPay);
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    public Member(){}

    public Member(int serialNo, String customerName, String customerID, int spentTime, int totalPay) {
        this.serialNo = serialNo;
        this.customerName = customerName;
        this.customerID = customerID;
        this.spentTime = spentTime;
        this.totalPay = totalPay;
    }

public void join() {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < addCustomerData.getMembers(); i++) {
        while (true) {
            System.out.println("========== Customer " + (i + 1) + " Info. =========");
            System.out.println("=============================================");
            System.out.println("1. Customer Name");
            System.out.println("2. Customer ID");
            System.out.println("3. Customer Spent Time");
            System.out.println("4. Customer Total Pay");
            System.out.println("5. Back");
            System.out.println("=============================================");
            System.out.print("Choose One: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("이전으로");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Input Customer's Name: ");
                    setCustomerName(sc.next());
                    break;
                case 2:
                    System.out.print("Input Customer's UserID: ");
                    setCustomerID(sc.next());
                    break;
                case 3:
                    System.out.print("Input Customer's Spent Time at Your Store: ");
                    setSpentTime(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Input Customer's Total Payment at your Store: ");
                    setTotalPay(sc.nextInt());
                    break;
            }
        }
    }


}


}
