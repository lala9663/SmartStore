package smartstore.first;

import smartstore.first.grade.General;
import smartstore.first.grade.VIP;
import smartstore.first.grade.VVIP;

import java.util.Scanner;

public class ViewParameter {
    Scanner sc = new Scanner(System.in);
    General general = new General();

    public void view(){
        while (true) {
            System.out.println("**Press 'end', if you want to exit! **");
            System.out.print("Which group(GENERAL, VIP, VVIP)? ");
            String choice = sc.next();

            if (choice.equals("end")) {
                System.out.println("이전으로 가기");
                break;
            }
            switch (choice){
                case "GENERAL":
                    System.out.println("Parameter: Parameter{minimunSpentTime="+general.getTime()+", minimumTotalPay="+general.getPay()+"}" );
                    break;

                case "VIP":
                    VIP vip = new VIP();
                    vip.rate();
                    break;

                case "VVIP":
                    VVIP vvip = new VVIP();
                    vvip.rate();
                    break;
            }
        }

    }
}
