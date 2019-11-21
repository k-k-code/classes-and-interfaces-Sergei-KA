//Общая информация
//        Цель работы - закрепление навыков использования абстрактных классов и интерфейсов.
//
//        Объекты приложения должны описывать сущности стратегической военной мини-игры и их поведение. По условию задачи в нашей игре должно быть два типа юнитов: техника и живая сила (солдаты).
//        У всех юнитов (и техники, и живой силы) есть две характеристики - максимальная скорость и уровень брони. У техники есть дополнительная характеристика - объем горючего.
//        У солдат есть дополнительная характеристика - здоровье.
//        Некоторые, но не все юниты могут стрелять. Юниты, которые могут стрелять обладают дополнительной характеристикой - сила выстрела.
//        Некоторые, но не все юниты реагируют на то что в них стреляют. Так, у солдата в которого стреляют, уменьшается здоровье, а у техники уменьшается объем горючего.

//        Уровень 1
//        В пакете com.brunoyam.unit_2.army добавить два пакета: "soldiers" и "machines", и перенести в них соответствующие по смыслу классы
//        Добавить необходимые абстрактные классы, вынести в них общие для всех юнитов одного типа поля и методы.


//Уровень 2
//        В пакете com.brunoyam.unit_2.army добавить интерфейс Shootable с методом getShot с одним параметром типа int.
//        В методе getShot всех классов, имплементирующих интерфейс shootable, уменьшать значение поля health на величину, переданную в параметре.
//        Имплементировать его так, чтобы он был реализован в классах
//        com.brunoyam.unit_2. ... .Medic
//        com.brunoyam.unit_2. ... .Sniper
//        com.brunoyam.unit_2. ... .Trooper
//        com.brunoyam.unit_2. ... .Transport
//        В пакете com.brunoyam.unit_2.army добавить интерфейс Shooter с методом shoot с одним параметром типа Shootable.
//        В методе shoot всех классов, инмлементирующих интерфейс Shooter, вызывать метод getShot переданного объекта передавая ему произвольное значение.
//        Имплементировать его так, чтобы он был реализован в классах
//        com.brunoyam.unit_2. ... .Sniper
//        com.brunoyam.unit_2. ... .Trooper
//        com.brunoyam.unit_2. ... .Tank
//        Написать реализацию методов shoot и getShot так, чтобы приложение иммитировало стрельбу юнитов друг по другу.
//                То есть, можно было вызвать метод shoot одного объекта, передав ему "цель" (ссылку на объект Shootable)
//                и после выполнения метода состояние объекта "цели" изменялось (уменьшалось "здоровье", либо "объем горючего")


package Machines;


import com.brunoyam.unit_2.army.Shootable;

abstract class Transport {


    private int armorLevel;
    private int maxSpeed;
    private int fuel;
    private int shotPower;

    Transport(int armorLevel, int maxSpeed, int fuelVolume, int shotPower) {
        this.armorLevel = armorLevel;
        this.fuel = fuelVolume;
        this.maxSpeed = maxSpeed;
        this.shotPower = shotPower;
    }

    public void showTransport() {
        System.out.println(armorLevel + " - Armor Level; " + maxSpeed + "  - Max speed " + fuel + " - Fuel Volume;");
    }


    public int getArmorLevel() {
        return armorLevel;
    }

    public void setArmorLevel(int armorLevel) {
        this.armorLevel = armorLevel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getShotPower() {
        return shotPower;
    }

    public void setShotPower(int shotPower) {
        this.shotPower = shotPower;
    }
}
