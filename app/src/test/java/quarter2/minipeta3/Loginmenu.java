package quarter2.minipeta3;

import java.util.Scanner;

public class Loginmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("WELCOME TO LOGIN MENU");
        System.out.println("========================");

        System.out.println("Username: Calvin");

        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (password.equals("pogi")) {
            System.out.println("PASOK KA NA");
        } else {
            System.out.println("MALI PARE");
        }
        scanner.close();
}   }