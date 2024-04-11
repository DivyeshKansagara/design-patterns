package strategy_pattern.with;

import strategy_pattern.with.stretegy.DriveStretegy;

public class Vehicle {
    final DriveStretegy driveStretegy;
    Vehicle (DriveStretegy driveStretegy){
        this.driveStretegy=driveStretegy;
    }
    public void drive(){
        driveStretegy.drive();
    }
}
