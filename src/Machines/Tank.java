package Machines;

import com.brunoyam.unit_2.army.Shootable;
import com.brunoyam.unit_2.army.Shooter;

public class Tank extends Transport implements Shooter {


    public Tank(int armorLevel, int maxSpeed, int fuel, int shotPower) {
        super(armorLevel, maxSpeed, fuel, shotPower);
    }

    @Override
    public void shoot(Shootable shootable) {
    shootable.getShoot(getShotPower());
    }
}
