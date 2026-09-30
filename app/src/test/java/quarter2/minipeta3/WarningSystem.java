package quarter2.minipeta3;

public class WarningSystem {
    public static void main(String[] args) {

        String name = "Morgado";
        int absences = 3;
//dwadwadd
        if (absences <= 2) {
            System.out.println(name + " - Good Standing");
        } else if (absences <= 5) {
            System.out.println(name + " - Warning");
        } else {
            System.out.println(name + " - At Risk");
        }
    }
}
