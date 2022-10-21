package smartstore.exceptions;

public class Exceptions {
    public static boolean check(String input, int rangeMin, int rangeMax){

        // 숫자로만 썼는지 확인
        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9'){
                System.out.printf("똑바로 입력해!");
                return false;
            }
        }
    return true;
    }

    //입력받은 문자열이 숫자라면 true, 반대인 경우 false
    public static boolean checkStringType(String input) {
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
}
