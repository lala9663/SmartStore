package smartstore.customer;

public class Print {

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
        System.out.println("==============================\n" +
                " 1. Customer Name\n" +
                " 2. Customer ID\n" +
                " 3. Customer Spent Time\n" +
                " 4. Customer Total Pay\n" +
                " 5. Back\n" +
                "==============================\n" +
                "Choose One: ");
    }

    public static void check(){
        System.out.println("** Press 0, if you want to exit! **");
        System.out.print("How many customers to input? ");
    }

    public static void view(){
        System.out.println("======= Customer Info. =======");
    }

    public static void out(){
        System.out.println("나가기");
    }
}
