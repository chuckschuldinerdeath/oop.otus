package ru.otus.transport;

public class Horse extends Transport implements Movement {

    String name;
    int energy;

    public Horse(int energy, String name) {
        this.energy = energy;
        this.name = name;
    }

    @Override
    public boolean move(Location location, int dist) {
        if (location.equals(Location.FIELD) || location.equals(Location.FOREST)) {
            energy = energy - dist;
            System.out.print(energy + " ");
            System.out.println(energy >= 0 ? true : false);
            return energy >= 0 ? true : false;
        } else {
            System.out.println("не может двигаться");
            return false;
        }
    }

}
