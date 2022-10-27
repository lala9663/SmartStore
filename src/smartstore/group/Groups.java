package smartstore.group;

import smartstore.Text;
import smartstore.exceptions.Exceptions;

import java.util.Scanner;

public class Groups {
    Group general = new Group();
    Group vip = new Group();
    Group vvip = new Group();

    public Groups() {
        this.general.groupType = GroupType.GENERAL;
        this.vip.groupType = GroupType.VIP;
        this.vvip.groupType = GroupType.VVIP;
    }

    public void setGroups(Scanner sc) {
        chooseGroup(sc);
    }

    public void viewGroups(Scanner sc) {
       chooseGroup(sc);
    }

    public void updateGroups(Scanner sc) {
       chooseGroup(sc);
    }

    private void checkWriteHistoryUpdate(Scanner sc, Group group) {
        if (group.writeHistory == false) {
            System.out.println("No parameter. Set the parameter first.\n");
        } else {
            viewParam(group);
            setParam(sc, group);
            viewParam(group);
        }
    }

    private void viewParam(Group group) {
        System.out.println("GroupType: " + group.groupType);
        System.out.println("Parameter: " + group.parameter.toString() + "\n");
        group.writeHistory = true;
    }


    //기존에 값이 쓰여진적이 있는지 확인
    private void checkWriteHistory(Scanner sc, Group group) {
        if (group.writeHistory == true) {
            System.out.println(group.groupType + " group already exists.\n");
            System.out.println("GroupType: " + group.groupType);
            System.out.println("Parameter: " + group.parameter.toString() + "\n");
            return;
        }
        group.writeHistory = true;
        setParam(sc, group);
    }

    private void setParam(Scanner sc, Group group) {
        while (true) {
            Text.timePay();
            String input = sc.nextLine();

            if (Exceptions.check(input, 1, 3)) {
                int chooseNum = Integer.parseInt(input);
                if (chooseNum == 1) {
                    setMinimumSpentTime(sc, group);
                } else if (chooseNum == 2) {
                    setMinimumTotalPay(sc, group);
                } else if (chooseNum == 3) {
                    return;
                }
            }
        }
    }

    private void setMinimumTotalPay(Scanner sc, Group group) {
        while (true) {
            System.out.print("Input Minimum Total Pay: ");
            String input = sc.nextLine();
            if (Exceptions.check(input, 0, Integer.MAX_VALUE)) {
                int minPay = Integer.parseInt(input);
                group.parameter.minTotalPay = minPay;
                return;
            }
        }
    }

    // 등급이 이전 등급보다 높은지? 너무 어렵다... general 값이 vip 값보다 크면 sout출력
    private void setMinimumSpentTime(Scanner sc, Group group) {
        while (true) {
            System.out.print("Input Minimum Spent Time: ");
            String input = sc.nextLine();
            if (Exceptions.check(input, 0, Integer.MAX_VALUE)) {
                int minTime = Integer.parseInt(input);
                group.parameter.minSpentTime = minTime;
                return;
            }
        }
    }

//    private void setMinimumSpentTime(Scanner sc, Group group) {
//        while (true) {
//            System.out.print("Input Minimum Spent Time: ");
//            String input = sc.nextLine();
//            if (Exceptions.check(input, 0, Integer.MAX_VALUE)) {
//                int minTime = Integer.parseInt(input);
//                group.parameter.minSpentTime = minTime;
//                return;
//            }
//            else if (sc.equals("VIP")) {
//                System.out.print("Input Minimum Spent Time: ");
//                 input = sc.nextLine();
//                if (Exceptions.check(input, 0, Integer.MAX_VALUE) && group.parameter.minSpentTime < general.parameter.minSpentTime) {
//                    int minTime = Integer.parseInt(input);
//                    group.parameter.minSpentTime = minTime;
//                    return;
//                }
//            }else if (sc.equals("VVIP")){
//                System.out.println("Input Minimum Spent Time: ");
//                input = sc.nextLine();
//                if (Exceptions.check(input, 0, Integer.MAX_VALUE) && group.parameter.minSpentTime < general.parameter.minSpentTime) {
//                    int minTime = Integer.parseInt(input);
//                    group.parameter.minSpentTime = minTime;
//                    return;
//                }
//            }
//        }
//    }


    private void selectGroup() {
        Text.group();
    }
    public void chooseGroup(Scanner sc){
        while (true) {
            selectGroup();
            String input = sc.nextLine();
            System.out.println();
            if (input.equalsIgnoreCase("GENERAL")) {
                checkWriteHistory(sc, general);
            } else if (input.equalsIgnoreCase("VIP")) {
                checkWriteHistory(sc, vip);
            } else if (input.equalsIgnoreCase("VVIP")) {
                checkWriteHistory(sc, vvip);
            } else if (input.equalsIgnoreCase("end")) {
                return;
            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

}