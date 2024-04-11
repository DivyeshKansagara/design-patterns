package strategy_pattern.with;

public class main {
    public static void main(String[] args) {
        Vehicle v = new GoodsVehicle();
        Vehicle v2 = new OffRoadVehicle();
        v.drive();
        v2.drive();
    }
}
