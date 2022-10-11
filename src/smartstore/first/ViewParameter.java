package smartstore.first;

import smartstore.first.grade.General;
import smartstore.first.grade.VIP;
import smartstore.first.grade.VVIP;

import java.util.Scanner;

public class ViewParameter {
    Scanner sc = new Scanner(System.in);
    General general = new General();
    VIP vip = new VIP();
    VVIP vvip = new VVIP();

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
                    if(General.getTime()==0 && General.getTime()== 0){
                        System.out.println(" ");
                        System.out.println("GroupType: GENERAL");
                        System.out.println("Parameter: null");
                        System.out.println(" ");
                        break;
                    }else{
                    System.out.println("Parameter: Parameter{minimunSpentTime="+general.getTime()+", minimumTotalPay="+general.getPay()+"}" );
                    break;}

                case "VIP":
                    if(VIP.getTime()==0 && VIP.getTime()== 0){
                        System.out.println(" ");
                        System.out.println("GroupType: VIP");
                        System.out.println("Parameter: null");
                        System.out.println(" ");
                        break;
                    }else{
                    System.out.println("Parameter: Parameter{minimunSpentTime="+vip.getTime()+", minimumTotalPay="+vip.getPay()+"}" );
                    break;}
                case "VVIP":
                    if(VVIP.getTime()==0 && VVIP.getTime()== 0){
                        System.out.println(" ");
                        System.out.println("GroupType: VVIP");
                        System.out.println("Parameter: null");
                        System.out.println(" ");
                        break;
                    }else{
                    System.out.println("Parameter: Parameter{minimunSpentTime="+vvip.getTime()+", minimumTotalPay="+vvip.getPay()+"}" );
                    break;}
            }
        }

    }
}
