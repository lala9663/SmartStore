//package smartstore.customer;
//
//import java.util.Scanner;
//
//// 이 클래스는 회원 추가 하는 클래스
//public class Customer {
//    Scanner sc = new Scanner(System.in);
//
//    //    private String[] names = new String[100];
////    private String[] ids = new String[100];
////    private int[] times = new int[100];
////    private int[] pays = new int[100];
//    private String name;
//    private String id;
//    private int time;
//    private int pay;
//
//    public Customer(String name, String id, int time, int pay) {
//        this.name = name;
//        this.id = id;
//        this.time = time;
//        this.pay = pay;
//    }
//
//    int plus = 0;
//    int sum = 0;
//
//    public String[] getNames() {
//        return names;
//    }
//
//    public String[] getIds() {
//        return ids;
//    }
//
//    public Customer(String[] names, String[] ids, int[] times, int[] pays) {
//        this.names = names;
//        this.ids = ids;
//        this.times = times;
//        this.pays = pays;
//    }
//    public  Customer(){
//
//    }
//
//    public int[] getTimes() {
//        return times;
//    }
//
//    public int[] getPays() {
//        return pays;
//    }
//
//    public int test(int X){
//        return X;
//    }
//
//    public void list() {
//       Print.check();
//        int count = sc.nextInt();
//
//        Customer[] customers = new Customer[count];
//
//        if (count == 0) {
//            System.out.println("나가기");
//        } else {
//            while (true) {
//                for (int i = 0; i < count; i++) {
//                    System.out.println("========== Customer " + (i + 1) + " Info. =========");
//                    Print.join();
//
//                    int num = sc.nextInt();
//                    switch (num) {
//                        case 5:
//
//                            break;
//                        case 1:
//                            System.out.print("Customer Name: ");
//                            String name = sc.next();
//                            names= name;
//
//                        case 2:
//                            System.out.print("Customer ID: ");
//                            String id = sc.next();
//                            ids[i] = id;
//
//                        case 3:
//                            System.out.print("Customer Spent Time: ");
//                            int time = sc.nextInt();
//                            times[i] = time;
//
//                        case 4:
//                            System.out.print("Customer Total Pay: ");
//                            int pay = sc.nextInt();
//                            pays[i] = pay;
//
//                    }
//                    System.out.println("========== Customer " + (i + 1) + " Info. =========");
//                    System.out.printf("%d\t, %s\t %s\t %s\t %s\n", i + 1, names[i], ids[i], times[i], pays[i]);
//                }
//                break;
//
//            }
//        }
//    }
//}
//
//
