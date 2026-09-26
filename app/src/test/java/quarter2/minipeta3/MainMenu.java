package quarter2.minipeta3;
import java.util.Scanner;
import org.junit.Test;


public class MainMenu {
    @Test
    public void printMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("    ATTENDANCE TRACKER SYSTEM    ");
        System.out.println("=================================");
        System.out.println("1. Login");
        System.out.println("2. View Records");
        System.out.println("3. System Alerts");
        System.out.println("0. Exit");
        System.out.println("Enter choice: ");
        System.out.println("==============");
    }
}
