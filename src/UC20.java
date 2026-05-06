public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("==========================================");

        // Create bogie array (empty train scenario)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        if (bogieIds.length == 0) {

            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search.");
        }

        boolean found = false;

        for (String id : bogieIds) {

            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + searchId + " found.");
        } else {
            System.out.println("\nBogie " + searchId + " not found.");
        }

        System.out.println("\nUC20 execution completed...");
    }
}
