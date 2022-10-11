package smartstore.first;

import smartstore.first.grade.General;
import smartstore.first.grade.VIP;
import smartstore.first.grade.VVIP;

import java.util.Scanner;

public class UpdateParameter {
    Scanner sc = new Scanner(System.in);
    General general = new General();
    VIP vip = new VIP();
    VVIP vvip = new VVIP();
    public static int time=0;
    public static int pay=0;

    public static void setTime(int time) {
       General.time = time;
       VIP.time = time;
       VVIP.time = time;
    }

    public static void setPay(int pay) {
        General.pay = pay;
        VIP.pay = pay;
       VVIP.pay = pay;
    }

    public static int getTime() {
        return time;
    }
    public static int getPay() {
        return pay;
    }

    public void update() {
        while (true) {
            System.out.println("**Press 'end', if you want to exit! **");
            System.out.print("Which group(GENERAL, VIP, VVIP)? ");
            String choice = sc.next();

            if (choice.equals("end")) {
                System.out.println("이전으로 가기");
                break;
            }
            switch (choice) {
                case "GENERAL":
                    if (General.getTime() == 0 && General.getTime() == 0) {
                        System.out.println(" ");
                        System.out.println("No parameter. Set the parameter first.");
                        System.out.println(" ");
                        break;
                    } else {
                        while (true) {
                            System.out.println(" ");
                            System.out.println("GroupType: GENERAL");
                            System.out.println("Parameter: Parameter{minimunSpentTime=" + general.getTime() + ", minimumTotalPay=" + general.getPay() + "}");
                            System.out.println(" ");
                            System.out.println("======================================");
                            System.out.println("1. Minimum Spent Time");
                            System.out.println("2. Minimum Total pay");
                            System.out.println("3. Back");
                            System.out.println("======================================");
                            System.out.print("Choose One: ");
                            int select = sc.nextInt();
                            if (select == 3) {
                                System.out.println("이전으로");
                                break;
                            }
                            switch (select) {
                                case 1:
                                    System.out.print("Input Minimum Spent Time: ");
                                    setTime(sc.nextInt());
                                    break;

                                case 2:
                                    System.out.print("Input Minimum Total Pay: ");
                                    setPay(sc.nextInt());
                                    break;
                            }
                        }
                    }
                     case "VIP":
                         if (VIP.getTime() == 0 && VIP.getTime() == 0) {
                             System.out.println(" ");
                             System.out.println("No parameter. Set the parameter first.");
                             System.out.println(" ");
                             break;
                         } else {
                             while (true) {
                                 System.out.println(" ");
                                 System.out.println("GroupType: GENERAL");
                                 System.out.println("Parameter: Parameter{minimunSpentTime=" + vip.getTime() + ", minimumTotalPay=" + vip.getPay() + "}");
                                 System.out.println(" ");
                                 System.out.println("======================================");
                                 System.out.println("1. Minimum Spent Time");
                                 System.out.println("2. Minimum Total pay");
                                 System.out.println("3. Back");
                                 System.out.println("======================================");
                                 System.out.print("Choose One: ");
                                 int select = sc.nextInt();
                                 if (select == 3) {
                                     System.out.println("이전으로");
                                     break;
                                 }
                                 switch (select) {
                                     case 1:
                                         System.out.print("Input Minimum Spent Time: ");
                                         setTime(sc.nextInt());
                                         break;

                                     case 2:
                                         System.out.print("Input Minimum Total Pay: ");
                                         setPay(sc.nextInt());
                                         break;
                                 }
                             }
                         }
                     case "VVIP":
                         if (VVIP.getTime() == 0 && VVIP.getTime() == 0) {
                             System.out.println(" ");
                             System.out.println("No parameter. Set the parameter first.");
                             System.out.println(" ");
                             break;
                         } else {
                             while (true) {
                                 System.out.println(" ");
                                 System.out.println("GroupType: GENERAL");
                                 System.out.println("Parameter: Parameter{minimunSpentTime=" + vvip.getTime() + ", minimumTotalPay=" + vvip.getPay() + "}");
                                 System.out.println(" ");
                                 System.out.println("======================================");
                                 System.out.println("1. Minimum Spent Time");
                                 System.out.println("2. Minimum Total pay");
                                 System.out.println("3. Back");
                                 System.out.println("======================================");
                                 System.out.print("Choose One: ");
                                 int select = sc.nextInt();
                                 if (select == 3) {
                                     System.out.println("이전으로");
                                     break;
                                 }
                                 switch (select) {
                                     case 1:
                                         System.out.print("Input Minimum Spent Time: ");
                                         setTime(sc.nextInt());
                                         break;

                                     case 2:
                                         System.out.print("Input Minimum Total Pay: ");
                                         setPay(sc.nextInt());
                                         break;
                                 }
                             }
                         }
                    }
            }

        }
    }

