package Soldiers;

import com.brunoyam.unit_2.army.Shootable;

public class Medic extends Soldier implements Shootable {


    public Medic(int armorLevel, int maxSpeed, int health) {
        super(armorLevel, maxSpeed, health);
    }
    @Override
    public void getShoot(int damage) {
        int i = getHealth() - damage;
        setHealth(i);

    }

}
