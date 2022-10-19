package smartstore.group;

import smartstore.group.grade.General;
import smartstore.group.grade.VIP;
import smartstore.group.grade.VVIP;

import java.util.Scanner;

public class SetParameter {
   Scanner sc = new Scanner(System.in);
    public void rate() {
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
                    General general = new General();
                    general.rate();
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
