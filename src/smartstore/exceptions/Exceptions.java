package smartstore.exceptions;

public class Exceptions {
    public static boolean check(String input, int rangeMin, int rangeMax){
        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9'){
                System.out.printf("예외처리! 숫자만 입력해주세요.\n");
                return false;
            }
        }
    return true;
    }


    // 이름 확인
    public static boolean checkName(String input) {
        for (int i = 0; i <input.length(); i++) {
            if (input.matches("^[a-zA-Z]*$") == false){
                System.out.printf("예외처리 5자 이상,영어만 입력해주세요.");
                return false;
            } else if (input.matches("^[a-zA-Z]*$") == true) {
                return  true;
            }
        }
        return true;
    }

    // ID 확인
    public static boolean checkID(String input) {
        for (int i = 0; i <input.length(); i++) {
            if (input.matches("^[a-zA-Z0-9]*$") == false){
                System.out.printf("예외처리 5자 이상,영어와 숫자만 입력해주세요.");
                return false;
            } else if (input.matches("^[a-zA-Z0-9]*$") == true) {
                return  true;
            }
        }
        return true;
    }


    public static boolean update(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9')
                return false;
        }
        return true;
    }



    public static int checkGroupType(String type) {
        if (type.equals("GENERAL")) {
            return 1;
        } else if (type.equals("VIP")) {
            return 2;
        } else if (type.equals("VVIP")) {
            return 3;
        } else if (type.equals("end")) {
            return 4;
        } else {
            System.out.println("Invalid Input. Please try again.");
            return 0;
        }
    }

    public static boolean checkSummary(String input) {
        for (int i = 0; i <input.length(); i++) {
            if (input.matches("^[a-zA-Z]*$") == false){
                System.out.printf("제대로 입력해주세요..");
                return false;
            } else if (input.matches("^[a-zA-Z]*$") == true) {
                return  true;
            }
        }
        return true;
    }

    // 등급이 이전 등급보다 높은지? 너무 어렵다... general 값이 vip 값보다 크면 sout출력

//    public static boolean checkGroup(String type){
//        if (type.equals("GENERAL"))
//    }

}
