package smartstore.second;

import java.util.Objects;
import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);

    public String serialNo;
    public String name;
    public String userID;
    public int spentTime;
    public int totalPay;


    public void list(String serialNo, String name, String userID, int spentTime, int totalPay) {
        this.serialNo = serialNo;
        this.name = name;
        this.userID = userID;
        this.spentTime = spentTime;
        this.totalPay = totalPay;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "sc=" + sc +
                ", serialNo='" + serialNo + '\'' +
                ", name='" + name + '\'' +
                ", userID='" + userID + '\'' +
                ", spentTime=" + spentTime +
                ", totalPay=" + totalPay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return spentTime == customer.spentTime && totalPay == customer.totalPay && Objects.equals(sc, customer.sc) && Objects.equals(serialNo, customer.serialNo) && Objects.equals(name, customer.name) && Objects.equals(userID, customer.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sc, serialNo, name, userID, spentTime, totalPay);
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    public void Name(){
        System.out.print("Input Customer's Name: ");     // 여기서 되돌아가기 창 만들어야 할거 같음
        this.name = sc.next();
    }

    public void ID(){
        System.out.print("Input Customer's ID");
        this.userID = sc.next();
    }

    public void SpentTime(){
        System.out.println("Input Customer's Spent Time");
        this.spentTime = sc.nextInt();
    }

    public void TotalPay(){
        System.out.println("Input Customer's Total Pay");
        this.totalPay = sc.nextInt();
    }
}
