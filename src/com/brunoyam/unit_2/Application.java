
//Уровень 3
//        Добавить метод recalculateField c двумя параметрами - типа Shooter[] и Shootable[] в класс Application.
//        Метод должен иммитировать один ход в игре. Мы считаем что за ход все "стрелки" из массива Shooter[] стреляют по всем "целям" из массива Shootable[]
//        Создать в методе main два массива, содержащих произвольный набор юнитов. Вызвать метод recalculateField, передав ему эти два массива.


package com.brunoyam.unit_2;


import Machines.Tank;
import Soldiers.Medic;
import Soldiers.Sniper;
import com.brunoyam.unit_2.army.Shootable;
import com.brunoyam.unit_2.army.Shooter;

public class Application {

    public static void main(String[] args) {

        Sniper guy1 = new Sniper(100, 20, 100, 15);
        Sniper guy2 = new Sniper(100, 20, 150, 25);
        Sniper enemyGuy = new Sniper(100, 15, 100, 50);
        Medic medGuy = new Medic(100, 15, 100);

//        medGuy.show();
//        enemyGuy.shoot(medGuy);
//        medGuy.show();

        Tank Tank1 = new Tank(1000, 100, 300, 90);

        Tank1.shoot(guy2);


//        Sniper[] ArmyShoot = new Sniper[5];
//        ArmyShoot[0] = new Sniper(100, 10, 150, 30);
//        ArmyShoot[1] = new Sniper(100, 10, 100, 40);
//        ArmyShoot[2] = new Sniper(100, 10, 160, 15);
//        ArmyShoot[3] = new Sniper(100, 10, 120, 20);
//        ArmyShoot[4] = new Sniper(100, 10, 190, 10);
//
//        Sniper[] ArmyGetShoot = new Sniper[5];
//        ArmyShoot[0] = new Sniper(100, 10, 110, 25);
//        ArmyShoot[1] = new Sniper(100, 10, 170, 10);
//        ArmyShoot[2] = new Sniper(100, 10, 90, 45);
//        ArmyShoot[3] = new Sniper(100, 10, 200, 5);
//        ArmyShoot[4] = new Sniper(100, 10, 100, 20);
//
//
//    }
//
//    public static void recalculateField(Shooter[] ArmyShoot, Shootable[] ArmyGetShoot) {
//
//
    }
}


