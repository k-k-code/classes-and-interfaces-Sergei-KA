package Machines;

import com.brunoyam.unit_2.army.Shootable;
import com.brunoyam.unit_2.army.Shooter;

public class Trooper extends Transport implements Shootable, Shooter {


    public Trooper(int armorLevel, int maxSpeed, int fuel, int shotPower) {
        super(armorLevel, maxSpeed, fuel, shotPower);
    }

    @Override
    public void getShoot(int damage) {
    int i = getFuel() - damage;
    setFuel(i);
    }

    @Override
    public void shoot(Shootable shootable) {
    shootable.getShoot(getShotPower());
    }
}
