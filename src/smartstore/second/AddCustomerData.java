package smartstore.second;

import smartstore.second.member.Member;

import java.util.Scanner;

public class AddCustomerData {
    Scanner sc = new Scanner(System.in);
    public int members = 0;

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public void addCustomer(){
        System.out.println("** Press -1, if you want to exit! **");
        System.out.print("How many customers to input? ");

        setMembers(sc.nextInt());

        while (true){
            if (members == -1 || members == 0){
                System.out.println("이전으로 돌아갑니다!");
                break;
            }
//            for (int i = 0; i <members ; i++) {
//                System.out.println("======================================");
//                System.out.println("1. Customer Name");
//                System.out.println("2. Customer ID");
//                System.out.println("3. Customer Spent Time");
//                System.out.println("4. Customer Total pay");
//                System.out.println("5. Back");
//                System.out.println("======================================");
//                System.out.print("Choose One: ");
//            }
                int choice = sc.nextInt();
//                if (choice == 5){
//                    System.out.println("이전? 으로 돌아갑니다");
//                    break;      // 이전으로 돌아가면 회원 추가 스킵?
//                }
                switch (members){
                    case 1:
                        Member member = new Member();
                        member.join();
                        break;
                    case 2:
                        ViewCustomerData viewCustomerData = new ViewCustomerData();
                        viewCustomerData.viewCustomerData();
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                }


        }
    }
}
