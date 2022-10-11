package smartstore.second;

import smartstore.second.member.Member;
public class ViewCustomerData {
    Member member = new Member();
    public void viewCustomerData(){
        System.out.println("====== Customer Info. ======");
        System.out.println("No.1 => Customer{serialNO= '0001', name= "+member.getCustomerName()+", userID= "+member.getCustomerID()
                +", spentTime= " +member.getSpentTime()+", totalPay= "+member.getTotalPay());
        }

    }
