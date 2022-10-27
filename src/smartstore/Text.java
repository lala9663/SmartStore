package smartstore;

public class Text {

//    public static void start() {
//        System.out.println("토이프로젝트 스마트스토어");
//    }

//    public static void showMenu() {
//        System.out.print("==============================\n" +
//                " 1. Classification Parameter\n" +
//                " 2. Customer Data\n" +
//                " 3. Summary\n" +
//                " 4. Quit\n" +
//                "==============================\n" +
//                "Choose One: ");
//    }

    public static void showMemberMenu(){
        System.out.print("==============================\n" +
                " 1. Set Parameter\n" +
                " 2. View Parameter\n" +
                " 3. Update Parameter\n" +
                " 4. Back\n" +
                "==============================\n" +
                "Choose One: ");
    }

    public static void join(){
        System.out.println("=============================================");
        System.out.println("1. Customer Name");
        System.out.println("2. Customer ID");
        System.out.println("3. Customer Spent Time");
        System.out.println("4. Customer Total Pay");
        System.out.println("5. Back or 다음");
        System.out.println("=============================================");
        System.out.print("Choose One: ");
    }

    public static void CustomerInfo() {
        System.out.print("==============================\n" +
                " 1. Customer Name\n" +
                " 2. Customer ID\n" +
                " 3. Customer Spent Time\n" +
                " 4. Customer Total Pay\n" +
                " 5. Back\n" +
                "==============================\n" +
                "Choose One: ");
    }

    public static void timePay(){
        System.out.println("==============================\n" +
                " 1. Minimum Spent Time\n" +
                " 2. Minimum Total Pay\n" +
                " 3. Back\n" +
                "==============================\n" +
                "Choose One: ");
    }

    public static void check(){
        System.out.println("** Press 0, if you want to exit! **");
        System.out.print("How many customers to input? ");
    }

    public static void group(){
       System.out.println("** Press 'end', if you want to exit! **\n" +
               "Which group (GENERAL, VIP, VVIP)? ");
}

    public static void view(){
        System.out.println("======= Customer Info. =======");
    }

    public static void out(){
        System.out.println("나가기");
    }

    public static void summary(){
        System.out.println("===================");
        System.out.println("1. Summary\n2. Summary(Sorted By Name)\n" +
                "3. Summary (Sorted By Spent Time)\n4. Summary (Sorted By Total Payment)\n" +
                "5. Back");
        System.out.println("===================");
        System.out.print("Choose One: ");
    }

    public static void AscDes(){
        System.out.println("** Press 'end', if you want to exit! **");
        System.out.println("Which order (ASCENDING, DESCENDING)? ASCENDING");
    }
    public static void bar(){
        System.out.println("===================");
    }

    public static void bar2(){
        System.out.println("-------------------");
    }



}
