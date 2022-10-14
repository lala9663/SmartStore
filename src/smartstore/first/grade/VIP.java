package smartstore.first.grade;

import java.util.Scanner;

public class VIP {
    public static int time = 0;
    public static int pay = 0;

    public static int getTime() {
        return time;
    }

    public static void setTime(int time) {
        VIP.time = time;
    }

    public static int getPay() {
        return pay;
    }

    public static void setPay(int pay) {
        VIP.pay = pay;
    }



        public void rate() {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("======================================");
                System.out.println("1. Minimum Spent Time");
                System.out.println("2. Minimum Total pay");
                System.out.println("3. Back");
                System.out.println("======================================");
                System.out.print("Choose One: ");
                int choice = sc.nextInt();

                if (choice == 3) {
                    System.out.println("이전으로");
                    break;
                }
                switch (choice) {
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





