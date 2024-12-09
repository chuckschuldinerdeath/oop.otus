package ru.otus.transport;

public class Bicycle extends Transport implements Movement {

    String name;

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public boolean move(Location location, int dist) {
        if(location.equals(Location.FIELD) || location.equals(Location.FOREST)){
            System.out.println(true);
            return true;
        }else{
            System.out.println("не может двигаться по данной местности");
            System.out.println(false);
            return false;
        }
    }
}
