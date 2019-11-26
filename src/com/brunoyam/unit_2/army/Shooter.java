package com.brunoyam.unit_2.army;

public interface Shooter {

    void shoot(Shootable shootable);
}


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