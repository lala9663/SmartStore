package smartstore.third;

import java.util.Scanner;

public class Summary {
    Scanner sc = new Scanner(System.in);

    public void third(){
        while (true){
            System.out.println("======================================");
            System.out.println("1. Summary");
            System.out.println("2. Summary (Sorted By Name");
            System.out.println("3. Summary (Sorted By Spent Time");
            System.out.println("4. Summary (sorted By Total Payment");
            System.out.println("5. Back");
            System.out.println("======================================");
            System.out.print("Choose One: ");

            int choice = sc.nextInt();
            if(choice == 5){
                System.out.println("처음으로 돌아갑니다");
                break;
            }
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("다시 입력하세요");
            }

        }

    }
}
