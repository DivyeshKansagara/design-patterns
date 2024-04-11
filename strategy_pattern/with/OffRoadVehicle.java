package strategy_pattern.with;

import strategy_pattern.with.stretegy.SpecialDriveStretegy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SpecialDriveStretegy());
    }
}
