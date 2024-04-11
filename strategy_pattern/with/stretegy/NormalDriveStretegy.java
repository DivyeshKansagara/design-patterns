package strategy_pattern.with.stretegy;

public class NormalDriveStretegy implements DriveStretegy{
    @Override
    public void drive() {
        System.out.println("normal drive");
    }
}
