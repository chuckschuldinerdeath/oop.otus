package ru.otus.transport;

public class Allroad implements Movement {

    String name;
    int tank = 100;

    public Allroad(String name) {
        this.name = name;
    }


    @Override
    public boolean move(Location location, int dist) {
        tank = tank - dist;
        return tank >= 0 ? true : false;
    }
}
