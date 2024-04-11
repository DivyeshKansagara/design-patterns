package strategy_pattern.with.stretegy;

public class SpecialDriveStretegy implements DriveStretegy{
    @Override
    public void drive() {
        System.out.println("special drive");
    }
}
