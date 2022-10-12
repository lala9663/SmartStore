package smartstore.second;

import smartstore.second.member.Member;
import smartstore.second.Customer;
public class ViewCustomerData {
    Member member = new Member();
    Customer customer = new Customer();
    public void viewCustomerData(){
        System.out.println("====== Customer Info. ======");
        for (int i = 0; i < 2; i++) {
            System.out.println("No.1 => Customer{serialNO= '0001', name= "+customer.names+", userID= "+member.getCustomerID()
                    +", spentTime= " +member.getSpentTime()+", totalPay= "+member.getTotalPay());
        }

        }

    }
