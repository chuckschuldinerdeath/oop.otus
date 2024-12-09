package ru.otus.transport;

public class Man implements Movement {

    private String name;
    private Transport currentTransport;
    static int energy = 100;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public boolean move(Location location, int dist) {
        energy = energy - dist;
        return energy >= 0 ? true : false;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }
}
