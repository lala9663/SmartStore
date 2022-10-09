package smartstore;

import java.util.Scanner;

public class Index {
    // 메인페이지
    public static void main(String[] args) {
        System.out.println("Toy-project");

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("======================================");
            System.out.println("1. Classification Parameter");
            System.out.println("2. Customer Date");
            System.out.println("3. Summary");
            System.out.println("4. Quit");
            System.out.println("======================================");
            System.out.print("Choose One: ");

            int choice = sc.nextInt();
            if(choice == 4){
                System.out.println("프로그램 종료합니다");
                break;
            }
            switch (choice){
                case 1:
                   ClassificationParameter classification = new ClassificationParameter();
                   classification.join();

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
