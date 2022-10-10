package smartstore.first.grade;

import java.util.Scanner;

public class General {
    private int time=0;
    private int pay=0;

    public void rate(){
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("======================================");
            System.out.println("1. Minimum Spent Time");
            System.out.println("2. Minimum Total pay");
            System.out.println("3. Back");
            System.out.println("======================================");
            System.out.print("Choose One: ");
            int choice = sc.nextInt();

            if (choice == 3){
                System.out.println("이전으로");
                break;
            }
            switch (choice){
                case 1:
                    System.out.print("Input Minimum Spent Time: ");
                    setTime(sc.nextInt());

                case  2:
                    System.out.print("Input Minimum Total Pay: ");
                    pay = sc.nextInt();
                    break;
            }
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }


}
