package strategy_pattern.with;

import strategy_pattern.with.stretegy.NormalDriveStretegy;
import strategy_pattern.with.stretegy.SpecialDriveStretegy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStretegy());
    }
}
