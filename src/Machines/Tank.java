package Machines;

import com.brunoyam.unit_2.army.Shootable;
import com.brunoyam.unit_2.army.Shooter;

public class Tank extends Transport implements Shooter {

    private int shotPower;

    public Tank(int armorLevel, int maxSpeed, int fuel, int shotPower) {
        super(armorLevel, maxSpeed, fuel);
        this.shotPower = shotPower;
    }

    @Override
    public void shoot(Shootable shootable) {
    shootable.getShoot(getShotPower());
    }

    public int getShotPower() {
        return shotPower;
    }

    public void setShotPower(int shotPower) {
        this.shotPower = shotPower;
    }
}
