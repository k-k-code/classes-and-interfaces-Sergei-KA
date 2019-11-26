package Soldiers;

import com.brunoyam.unit_2.army.Shootable;
import com.brunoyam.unit_2.army.Shooter;

public class Sniper extends Soldier implements Shootable, Shooter {

    int shootPower;

    public Sniper(int armorLevel, int maxSpeed, int health, int shootPower) {
        super(armorLevel, maxSpeed, health);
        this.shootPower = shootPower;
    }

    @Override
    public void shoot(Shootable shootable) {
        shootable.getShoot(shootPower);
    }

    @Override
    public void getShoot(int damage) {
        int i = getHealth() - damage;
        setHealth(i);
    }

}
