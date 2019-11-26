package Machines;

import com.brunoyam.unit_2.army.Shootable;

public class Transport extends Trooper implements Shootable {

    public Transport(int armorLevel, int maxSpeed, int fuel) {
        super(armorLevel, maxSpeed, fuel);
    }

    @Override
    public void getShoot(int damage) {

    }
}
