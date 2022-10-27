package smartstore.summary;

import smartstore.Text;
import smartstore.customer.Customers;
import smartstore.exceptions.Exceptions;

import java.util.Scanner;

public class Summary {

    Scanner sc = new Scanner(System.in);

    public void list(Scanner sc) {
        while (true) {
            Text.summary();
            String input = sc.nextLine();
            System.out.println();
            if (Exceptions.check(input, 1, 5)) {
                int chooseNum = Integer.parseInt(input);
                if (chooseNum == 1) {
//                    setMinimumSpentTime(sc, group);

                } else if (chooseNum == 2) {
                    Text.AscDes();
                    String AscDes = sc.nextLine();
                    if (AscDes.matches("ASCENDING")) {
                        // 오름차순 정렬
                    } else if (AscDes.matches("DESCENDING")) {
                        // 내림차순 정렬
                    }
                    // 이름 순
                } else if (chooseNum == 3) {
                    Text.AscDes();
                    String AscDes = sc.nextLine();
                    if (AscDes.matches("ASCENDING")) {
                        // 오름차순 정렬
                    } else if (AscDes.matches("DESCENDING")) {
                        // 내림차순 정렬
                    }
                    // 시간 순
                } else if (chooseNum == 4) {
                    Text.AscDes();
                    String AscDes = sc.nextLine();
                    if (AscDes.matches("ASCENDING")) {
                        // 오름차순 정렬
                    } else if (AscDes.matches("DESCENDING")) {
                        // 내림차순 정렬
                    }
                    // 가격 순
                } else if (chooseNum == 5) {
                    Text.AscDes();
                    String AscDes = sc.nextLine();
                    if (AscDes.matches("ASCENDING")) {
                        // 오름차순 정렬
                    } else if (AscDes.matches("DESCENDING")) {
                        // 내림차순 정렬
                    }
                    return;
                }
            }
        }
    }

    public String choiceOrderType() {
        System.out.print("Which order (ASCENDING, DESCENDING)? ");
        String str = sc.next();
        str = str.toUpperCase();
        return str;
    }

    // 등록 명단 가져와서 나열하기
//    public void summaryByName(Customers customers){
//        String str = choiceOrderType();
//        for () {
//
//        }
//        System.out.println("Others : " +  + "customer(s)");
//    }
//

}
