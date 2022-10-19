package smartstore.group.grade;

public class Null {
    General general = new General();
    VIP vip = new VIP();
    VVIP vvip = new VVIP();

    public void empty() {
        if (General.getTime() == 0 && General.getTime() == 0) {
            System.out.println(" ");
            System.out.println("GroupType: GENERAL");
            System.out.println("Parameter: null");
            System.out.println(" ");

        }

    }
}
