package smartstore.first;

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
            }
        }
    }
}
