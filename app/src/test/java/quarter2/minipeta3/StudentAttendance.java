package quarter2.minipeta3;

public class StudentAttendance {public static class Main {

    public static void main(String[] args) {

        // Student records
        String[] studentID = {
                "2024-001",
                "2024-002",
                "2024-003",
                "2024-004"
        };

        String[] studentName = {
                "Jerran Carl Gonzales",
                "Calvin De Jesus",
                "Joshua Morgado",
                "Katlin Lacsamana"
        };

        int[] totalAbsences = {
                2,
                1,
                0,
                4
        };

        int[] totalTardiness = {
                1,
                3,
                2,
                5
        };

        // Display all student attendance records
        System.out.println("=== STUDENT ATTENDANCE RECORDS ===\n");
        for (int i = 0; i < studentID.length; i++) {
            System.out.println("Student ID: " + studentID[i]);
            System.out.println("Student Name: " + studentName[i]);
            System.out.println("Total Absences: " + totalAbsences[i]);
            System.out.println("Total Tardiness: " + totalTardiness[i]);
            System.out.println("----------------------------");
        }
    }
}

}
