import java.util.*;

public class UC12 {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static boolean isSafe(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                        b.cargo.equals("Petroleum")
                );
    }

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));

        boolean safe = isSafe(bogies);

        System.out.println("Train Safety Status: " +
                (safe ? "SAFE" : "UNSAFE"));
    }
}
