import java.util.regex.*;

public class UC11 {
    public static boolean isValidTrainID(String trainId) {
        String pattern = "TRN-\\d{4}";
        return Pattern.matches(pattern, trainId);
    }

    public static boolean isValidCargoCode(String cargoCode) {
        String pattern = "PET-[A-Z]{2}";
        return Pattern.matches(pattern, cargoCode);
    }

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID: " + trainId +
                " → " + (isValidTrainID(trainId) ? "Valid" : "Invalid"));

        System.out.println("Cargo Code: " + cargoCode +
                " → " + (isValidCargoCode(cargoCode) ? "Valid" : "Invalid"));
    }
}
