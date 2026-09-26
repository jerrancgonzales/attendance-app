package quarter2.minipeta3;

public class MenuTestingFile {
    public void testCompleteFastFoodFlow() {

        int transactionCount = 1;
        while (transactionCount <= 4) {
            System.out.println("Generating orders for Transaction #" + transactionCount);

            StringBuffer automatedInput = new StringBuffer();
            if (transactionCount == 1) {
                automatedInput.append("1\n"); // Order a burger
            } else if (transactionCount ==2) {
                automatedInput.append("2\n");
                automatedInput.append("50\n"); // Total of $50
            } else {
                automatedInput.append("2\n");
                automatedInput.append("50\n"); // Payment
            }
            transactionCount++;






            }
        }
    }

