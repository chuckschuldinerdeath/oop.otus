package ru.otus.transport;

public class Car extends Transport implements Movement {

    String name;
    int tank;

    public Car(String name, int tank) {
        this.name = name;
        this.tank = tank;
    }

    @Override
    public boolean move(Location location, int dist) {
        if(location.equals(Location.FIELD)){
            tank = tank - dist;
            System.out.print(tank + " ");
            System.out.println(tank >= 0 ? true : false);
            return tank >= 0 ? true : false;
        } else{
            System.out.println("машина не может двигаться по данной местности");
            return false;
        }
    }
}
