import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String socialSN;
        String uniNum;
        String menuChoice;

        socialSN = InputHelper.getRegExString(scan, "Enter your SSN: [xxx-xx-xxxx]", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + socialSN);
        uniNum = InputHelper.getRegExString(scan, "Enter your Student M Number [MXXXXX]", "(M|m)\\d{5}");
        System.out.println("Your Student M Number is: " + uniNum);
        menuChoice = InputHelper.getRegExString(scan, "Menu: O - Open | S - Save | V - View | Q - Quit", "[OoSsVvQq]");
        System.out.println("You choose: " + menuChoice);
    }
}
