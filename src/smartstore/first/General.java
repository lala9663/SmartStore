package smartstore.first;

import java.util.Scanner;

public class General {
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

                    break;
                case  2:

                    break;
            }
        }

    }
}
