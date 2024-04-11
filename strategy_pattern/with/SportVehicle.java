package strategy_pattern.with;

import strategy_pattern.with.stretegy.SpecialDriveStretegy;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SpecialDriveStretegy());
    }
}
