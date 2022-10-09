package smartstore;

import java.util.Scanner;

public class ClassificationParameter {
    Scanner sc = new Scanner(System.in);
    void join(){

        while (true){

            System.out.println("======================================");
            System.out.println("1. Set Parameter");
            System.out.println("2. View Parameter");
            System.out.println("3. Update Parameter");
            System.out.println("4. Back");
            System.out.println("======================================");
            System.out.print("Choose One: ");

            int choice = sc.nextInt();
            if(choice == 4){
                System.out.println("돌아가기!");
                break;
            }
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("다시 입력하세요");
            }
        }
    }
}
